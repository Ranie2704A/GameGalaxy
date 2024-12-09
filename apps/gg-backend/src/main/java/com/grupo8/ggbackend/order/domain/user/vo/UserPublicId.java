package com.grupo8.ggbackend.order.domain.user.vo;

import com.grupo8.ggbackend.shared.error.domain.Assert;

import java.util.UUID;

public record UserPublicId(UUID value) {

  public UserPublicId {

    Assert.notNull("value", value);

  }
}
