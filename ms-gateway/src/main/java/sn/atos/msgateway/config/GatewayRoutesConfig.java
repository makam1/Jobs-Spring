package sn.atos.msgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutesConfig {

  AuthenticationFilter filter;

  public GatewayRoutesConfig(AuthenticationFilter filter) {
    this.filter = filter;
  }

  @Bean
  public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
    return builder.routes()
      .route("ms-users", r -> r.path("/api/v1/js-users/**")
        .filters(f -> f.filter(filter))
        .uri("http://127.0.0.1:9001/"))

      .route("ms-jobs", r -> r.path("/api/v1/js-jobs/**")
        .filters(f -> f.filter(filter))
        .uri("http://127.0.0.1:9002/"))

      .build();
  }
}