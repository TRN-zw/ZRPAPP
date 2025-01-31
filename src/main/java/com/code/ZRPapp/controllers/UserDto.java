package com.code.ZRPapp.controllers;

import com.code.ZRPapp.models.FingerPrintForm;
import com.code.ZRPapp.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class UserDto {

    private Long id;

    private String name;

    private String surname;

    private String username;

    private String password;

    private String role;

    public static UserDto constructUser(User user){
        if (Objects.isNull(user))
            return null;

        return new UserDto(user.getId(), user.getName(), user.getSurname(), user.getUsername(), user.getPassword(),user.getRole());
    }
}
