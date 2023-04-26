package com.example.validationInSpringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
public class User {

    @NotNull
    private int userid;

    @NotBlank
    private String username;

    @NotEmpty
    @Pattern(regexp = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$")
    private String DateOfBirth;

    @NotBlank
    @Email
    private String email;

    @Size(min=10,max=12)
    @Pattern(regexp = "^[0-9]+$")
    private String Phone_Number;


    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$")
    private String Date;

    @Pattern(regexp = "^(0?[1-9]|1[0-2]):[0-5][0-9] (am|pm)$")
    private String Time;

}
