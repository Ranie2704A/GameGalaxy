package com.grupo8.ggbackend.order.domain.user.vo;

import com.grupo8.ggbackend.shared.error.domain.Assert;

public record UserEmail(String value) {

  public UserEmail {

    Assert.field("value", value).maxLength(255);

  }
}
