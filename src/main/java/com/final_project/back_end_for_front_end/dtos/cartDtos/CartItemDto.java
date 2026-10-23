package com.final_project.back_end_for_front_end.dtos.cartDtos;

import java.util.Set;

public class CartItemDto {
    private Long id;
    private String name;
    private PriceDto price;
    private String type;
    private Integer quantity;
    private Set<CartItemOptionDto> options;
}
