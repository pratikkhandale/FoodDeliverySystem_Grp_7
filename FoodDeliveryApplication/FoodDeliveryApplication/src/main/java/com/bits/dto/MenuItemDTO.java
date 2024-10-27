package com.bits.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDTO {
    private Long id;

    @NotEmpty(message = "Item name is required")
    private String name;

    @NotEmpty(message = "Description is required")
    private String description;

    private Double price;
    private Boolean available;
}
