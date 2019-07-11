package com.example.udemy.javadesignpatterns.patterns.dto.converters;

import com.example.udemy.javadesignpatterns.patterns.dto.domain.User;
import com.example.udemy.javadesignpatterns.patterns.dto.service.UserDTO;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserToUserDtoConverterTest {

    @Test
    public void verifyUserIsConvertedToUserDto() {
        User testUser = User.builder().id(1L).firstName("Test Name").lastName("Test Last Name")
                .address("Test Address").build();

        UserDTO userDTO = UserToUserDtoConverter.convert(testUser);

        assertEquals(testUser.getId(), userDTO.getId());
        assertEquals(testUser.getFirstName(), userDTO.getFirstName());
        assertEquals(testUser.getLastName(), userDTO.getLastName());
        assertEquals(testUser.getAddress(), userDTO.getAddress());
    }

    @Test
    public void verifyNullIsReturnedWhenUserIsNull() {

        assertNull(UserToUserDtoConverter.convert(null));
    }

}