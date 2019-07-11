package com.example.udemy.javadesignpatterns.patterns.dto.converters;

import com.example.udemy.javadesignpatterns.patterns.dto.domain.User;
import com.example.udemy.javadesignpatterns.patterns.dto.service.UserDTO;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDtoToUserConverterTest {

    @Test
    public void verifyUserDtoIsConvertedToUser() {
        UserDTO testUserDto = UserDTO.builder().id(1L).firstName("Test Name").lastName("Test Last Name")
                .address("Test Address").build();

        User user = UserDtoToUserConverter.convert(testUserDto);

        assertEquals(testUserDto.getId(), user.getId());
        assertEquals(testUserDto.getFirstName(), user.getFirstName());
        assertEquals(testUserDto.getLastName(), user.getLastName());
        assertEquals(testUserDto.getAddress(), user.getAddress());
    }

    @Test
    public void verifyNullIsReturnedWhenUserIsNull() {

        assertNull(UserDtoToUserConverter.convert(null));
    }
}