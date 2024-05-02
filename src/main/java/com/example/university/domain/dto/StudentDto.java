package com.example.university.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StudentDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long addressId;
}
