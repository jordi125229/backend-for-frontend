package com.final_project.back_end_for_front_end.dtos.cartDtos;

import java.util.List;

public class CartDto {
    private String userId;
    private CartPriceDto price;
    private List<CartItemDto> cartItems;
}
