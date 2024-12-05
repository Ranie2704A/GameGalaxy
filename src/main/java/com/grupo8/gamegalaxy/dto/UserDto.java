package com.grupo8.gamegalaxy.dto;


import com.grupo8.gamegalaxy.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private long id;
    private String email;
    private String name;
    private UserRole userRole;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
