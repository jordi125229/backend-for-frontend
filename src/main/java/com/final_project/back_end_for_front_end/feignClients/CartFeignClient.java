package com.final_project.back_end_for_front_end.feignClients;

import com.final_project.back_end_for_front_end.dtos.cartDtos.CartDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@FeignClient(name = "cart-service", url = "${SHOPPING_CART_SERVICE_URL}")
public interface CartFeignClient {

    @PostMapping("/add/{userId}/{productId}/{productQuantity}")
    CartDto addProductToCart(@PathVariable String userId, @PathVariable Long productId, @PathVariable int productQuantity, @RequestParam(required = false) Set<Long> optionIds);

    @GetMapping("/{userId}")
    CartDto getCart(@PathVariable String userId);
}
