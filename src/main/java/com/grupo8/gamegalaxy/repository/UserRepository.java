package com.grupo8.gamegalaxy.repository;

import com.grupo8.gamegalaxy.entity.User;
import com.grupo8.gamegalaxy.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByEmail(String email);

    User findByRole(UserRole userRole);

}
