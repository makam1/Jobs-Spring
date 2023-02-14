package sn.atos.msgateway.config;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouterValidator {

  public static final List<String> openApiEndpoints = List.of(
    "/auth/register",
    "/auth/login",
    "/auth/logout",
    "/auth/refreshtoken"
  );

  public Predicate<ServerHttpRequest> isSecured =
    request -> openApiEndpoints
      .stream()
      .noneMatch(uri -> request.getURI().getPath().contains(uri));
}