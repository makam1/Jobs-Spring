package com.ada.administrationservice.config.auditing;

import java.util.Optional;

import com.ada.administrationservice.web.security.services.UserDetailsImpl;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Component;


@Component
public class AuditorAwareImpl implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {
    return Optional.ofNullable(SecurityContextHolder.getContext())
      .map(SecurityContext::getAuthentication)
      .filter(Authentication::isAuthenticated)
      .map(authentication -> {
        if (authentication instanceof AnonymousAuthenticationToken) {
          return null;
        }
        UserDetailsImpl currentUser = (UserDetailsImpl) authentication.getPrincipal();
        return currentUser.getId();
      });
  }
}
