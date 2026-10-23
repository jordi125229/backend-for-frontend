package com.final_project.back_end_for_front_end.controllers;

import com.final_project.back_end_for_front_end.dtos.orderDtos.OrderDto;
import com.final_project.back_end_for_front_end.feignClients.OrderFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class OrderController {

    private final OrderFeignClient orderFeignClient;

    @GetMapping
    public OrderDto getOrderByUserAndId(@PathVariable String userId, @PathVariable Long orderNumber) {
        return orderFeignClient.getOrderByUserAndId(userId, orderNumber);
    }

    @PostMapping("/new")
    public OrderDto placeOrder(@PathVariable String userId) {
        return orderFeignClient.placeOrder(userId);
    }
}
