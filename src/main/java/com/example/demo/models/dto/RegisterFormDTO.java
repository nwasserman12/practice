package com.example.demo.models.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class RegisterFormDTO extends LoginFormDTO {

    @NotNull
    @Size(min =1, max =35, message = "First name required")
    private String firstName;

    @NotNull
    @Size(min = 1, max =35, message = "Last name required")
    private String lastName;

    @NotNull
    @DateTimeFormat(pattern = "MM-DD-yyyy")
    private Date dateOfBirth;

}
