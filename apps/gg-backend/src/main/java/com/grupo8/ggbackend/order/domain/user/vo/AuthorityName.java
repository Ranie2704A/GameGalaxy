package com.grupo8.ggbackend.order.domain.user.vo;

import com.grupo8.ggbackend.shared.error.domain.Assert;

public record AuthorityName(String name) {

  public AuthorityName{
    Assert.field("name", name).notNull();
  }

}
