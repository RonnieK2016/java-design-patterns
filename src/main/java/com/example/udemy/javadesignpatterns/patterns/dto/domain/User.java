package com.example.udemy.javadesignpatterns.patterns.dto.domain;

import lombok.*;

@Getter
@AllArgsConstructor
@Builder
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
}
