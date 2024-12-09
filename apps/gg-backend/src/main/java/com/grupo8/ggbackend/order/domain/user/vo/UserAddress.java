package com.grupo8.ggbackend.order.domain.user.vo;


import com.grupo8.ggbackend.shared.error.domain.Assert;
import org.jilt.Builder;


@Builder
public record UserAddress(String street, String city, String zipcode, String country) {

  public UserAddress{
    Assert.field("street", street).notNull();
    Assert.field("city", city).notNull();
    Assert.field("zipcode", zipcode).notNull();
    Assert.field("country", country).notNull();
  }

}
