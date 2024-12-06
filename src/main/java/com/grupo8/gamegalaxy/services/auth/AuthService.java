package com.grupo8.gamegalaxy.services.auth;

import com.grupo8.gamegalaxy.dto.SignupRequest;
import com.grupo8.gamegalaxy.dto.UserDto;
import com.grupo8.gamegalaxy.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);
}
