package com.example.udemy.javadesignpatterns.patterns.dto.converters;

import com.example.udemy.javadesignpatterns.patterns.dto.domain.User;
import com.example.udemy.javadesignpatterns.patterns.dto.service.UserDTO;

public class UserToUserDtoConverter {

    public static UserDTO convert(User user) {
        if(user == null) {
            return null;
        }

        return UserDTO.builder().id(user.getId()).firstName(user.getFirstName())
                .lastName(user.getLastName()).address(user.getAddress()).build();
    }
}
