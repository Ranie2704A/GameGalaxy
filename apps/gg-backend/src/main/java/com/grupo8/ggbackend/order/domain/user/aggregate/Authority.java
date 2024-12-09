package com.grupo8.ggbackend.order.domain.user.aggregate;


import com.grupo8.ggbackend.order.domain.user.vo.AuthorityName;
import com.grupo8.ggbackend.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

  private AuthorityName authorityName;

  Authority(AuthorityName authorityName) {
    Assert.notNull("name", authorityName);
    this.authorityName = authorityName;
  }

  public AuthorityName getAuthorityName() {
    return authorityName;
  }
}
