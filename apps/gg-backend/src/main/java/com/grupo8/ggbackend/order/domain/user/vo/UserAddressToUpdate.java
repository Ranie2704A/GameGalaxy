package com.grupo8.ggbackend.order.domain.user.vo;


import com.grupo8.ggbackend.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public record UserAddressToUpdate(UserPublicId publicId, UserAddress userAddress) {

  public UserAddressToUpdate{

    Assert.notNull("value", publicId);
    Assert.notNull("value", userAddress);

  }

}
