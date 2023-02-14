package sn.atos.msgateway.config;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sn.atos.msgateway.data.dao.BlackListAccessTokenDao;

@RefreshScope
@Component
public class AuthenticationFilter implements GatewayFilter {

  @Autowired
  private RouterValidator routerValidator;

  @Autowired
  private BlackListAccessTokenDao blackListAccessTokenDao;

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
    ServerHttpRequest request = exchange.getRequest();

    if (routerValidator.isSecured.test(request)) {
      if (this.isAuthMissing(request))
        return this.onError(exchange, "Authorization header is missing in request", HttpStatus.UNAUTHORIZED);

      final String token = this.getAuthHeader(request);

      if (blackListAccessTokenDao.existsByAccessToken(token))
        return this.onError(exchange, "AccessToken is invalid", HttpStatus.UNAUTHORIZED);
    }
    return chain.filter(exchange);
  }


  /*PRIVATE*/

  private Mono<Void> onError(ServerWebExchange exchange, String err, HttpStatus httpStatus) {
    ServerHttpResponse response = exchange.getResponse();
    byte[] bytes = err.getBytes(StandardCharsets.UTF_8);
    
    DataBuffer buffer = response.bufferFactory().wrap(bytes);

    response.setStatusCode(httpStatus);
    return response.writeWith(Flux.just(buffer));
  }

  private String getAuthHeader(ServerHttpRequest request) {
    return request.getHeaders().getOrEmpty("Authorization").get(0).replace("Bearer ", "");
  }

  private boolean isAuthMissing(ServerHttpRequest request) {
    return !request.getHeaders().containsKey("Authorization") || !request.getHeaders().getOrEmpty("Authorization").get(0).startsWith("Bearer ");
  }
}