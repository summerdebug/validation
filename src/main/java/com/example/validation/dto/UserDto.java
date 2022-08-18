package com.example.validation.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {

    @NotBlank(message = "firstName is blank")
    private String firstName;

    @NotBlank(message = "last name is blank")
    private String lastName;

    @Email(message = "email validation failed")
    private String email;

}
