package com.example.demo.models.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
public class RegisterFormDTO extends LoginFormDTO {

    @NotNull
    @Size(min =1, max =35, message = "First name required")
    private String firstName;

    @NotNull
    @Size(min = 1, max =35, message = "Last name required")
    private String lastName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    private String verifyPassword;

}
