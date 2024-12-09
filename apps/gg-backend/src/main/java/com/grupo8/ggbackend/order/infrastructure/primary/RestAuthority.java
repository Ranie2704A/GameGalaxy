package com.grupo8.ggbackend.order.infrastructure.primary;

import com.grupo8.ggbackend.order.domain.user.aggregate.Authority;
import org.jilt.Builder;

import java.util.Set;
import java.util.stream.Collectors;

@Builder
public record RestAuthority(String name) {

  public static Set<String> fromSet(Set<Authority> authorities) {
    return authorities.stream()
      .map(authority -> authority.getAuthorityName().name())
      .collect(Collectors.toSet());
  }

}
