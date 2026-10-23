package com.final_project.back_end_for_front_end.feignClients;

import com.final_project.back_end_for_front_end.dtos.orderDtos.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "order-service",  url = "${ORDER_SERVICE_URL}")
public interface OrderFeignClient {

    @PostMapping("/{userId}")
    OrderDto placeOrder(@PathVariable String userId);

    @GetMapping("/{userId}/{orderNumber}")
    OrderDto getOrderByUserAndId(@PathVariable String userId, @PathVariable Long orderNumber);
}
