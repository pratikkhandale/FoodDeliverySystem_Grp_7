package com.bits.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;

    @NotEmpty(message = "Username is required")
    private String username;

    @NotEmpty(message = "Password is required")
    private String password;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email is required")
    private String email;

    private String role; // Roles can be CUSTOMER, RESTAURANT_OWNER, DELIVERY_PERSONNEL, ADMIN
}
