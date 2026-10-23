package com.final_project.back_end_for_front_end.controllers;

import com.final_project.back_end_for_front_end.dtos.cartDtos.CartDto;
import com.final_project.back_end_for_front_end.feignClients.CartFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartFeignClient cartFeignClient;

    @PostMapping("/add/{userId}/{productId}/{productQuantity}")
    public CartDto addProductToCart(@PathVariable String userId, @PathVariable Long productId, @PathVariable int productQuantity, @RequestParam(required = false) Set<Long> optionIds) {
        return cartFeignClient.addProductToCart(userId, productId, productQuantity, optionIds);
    }

    @GetMapping("/{userId}")
    public CartDto getCart(@PathVariable String userId) {
        return cartFeignClient.getCart(userId);
    }
}
