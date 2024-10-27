package com.bits.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDTO {
    private Long id;

    @NotEmpty(message = "Restaurant name is required")
    private String name;

    @NotEmpty(message = "Address is required")
    private String address;

    @NotEmpty(message = "Hours of operation are required")
    private String hoursOfOperation;
}
