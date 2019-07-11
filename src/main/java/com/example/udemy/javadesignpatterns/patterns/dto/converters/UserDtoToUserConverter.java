package com.example.udemy.javadesignpatterns.patterns.dto.converters;

import com.example.udemy.javadesignpatterns.patterns.dto.domain.User;
import com.example.udemy.javadesignpatterns.patterns.dto.service.UserDTO;

public class UserDtoToUserConverter {

    public static User convert(UserDTO userDto) {
        if(userDto == null) {
            return null;
        }

        return User.builder().id(userDto.getId()).firstName(userDto.getFirstName())
                .lastName(userDto.getLastName()).address(userDto.getAddress()).build();
    }
}
