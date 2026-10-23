package com.final_project.back_end_for_front_end.dtos.orderDtos;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDto {
    private Long orderNumber;
    private String user;
    private List<OrderItemDto> orderItems;
    private OrderPriceDto price;
    private OrderStatusDto orderStatus;
    private LocalDateTime createdAt;
    private LocalDateTime confirmedAt;
    private LocalDateTime completedAt;
}
