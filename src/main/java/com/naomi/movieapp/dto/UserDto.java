package com.naomi.movieapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotBlank(message = "Field is required")
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String telephone;
    @NotBlank(message = "Field is required")
    private String password;
}
