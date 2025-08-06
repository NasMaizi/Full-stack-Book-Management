package com.nasro.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record RegistrationRequest(
        @NotEmpty(message = "firstname is mandatory")
        @NotBlank(message = "firstname is mandatory")
         String firstname,
        @NotEmpty(message = "lastname is mandatory")
        @NotBlank(message = "lastname is mandatory")
         String lastname,
        @Email(message = "Email not formatted")
        @NotEmpty(message = "email is mandatory")
        @NotBlank(message = "email is mandatory")
         String email,
        @NotEmpty(message = "Password is mandatory")
        @NotBlank(message = "Password is mandatory")
        @Size(min = 8, message = "Password should be 8 characters long min")
         String password
) {
}
