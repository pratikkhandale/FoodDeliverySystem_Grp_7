package com.bits.entity;

import com.bits.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
//Assuming a user entity to handle roles
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role; // Enum for roles: CUSTOMER, RESTAURANT_OWNER, DELIVERY_PERSONNEL, ADMIN
}
