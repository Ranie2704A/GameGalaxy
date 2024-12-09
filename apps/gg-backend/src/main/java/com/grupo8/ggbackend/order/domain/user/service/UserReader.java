package com.grupo8.ggbackend.order.domain.user.service;

import com.grupo8.ggbackend.order.domain.user.aggregate.User;
import com.grupo8.ggbackend.order.domain.user.repository.UserRepository;
import com.grupo8.ggbackend.order.domain.user.vo.UserEmail;
import com.grupo8.ggbackend.order.domain.user.vo.UserPublicId;

import java.util.Optional;

public class UserReader {

  private final UserRepository userRepository;

  public UserReader(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Optional<User> getByEmail(UserEmail userEmail) {
    return userRepository.getOneByEmail(userEmail);
  }

  public Optional<User> getByPublicId(UserPublicId userPublicId) {
    return userRepository.get(userPublicId);
  }
}
