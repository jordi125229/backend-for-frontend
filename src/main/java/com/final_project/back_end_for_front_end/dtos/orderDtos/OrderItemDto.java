package com.final_project.back_end_for_front_end.dtos.orderDtos;

import java.util.List;

public class OrderItemDto {
    private String name;
    private List<OrderOptionDto> options;
    private OrderItemPriceDto price;
    private Integer quantity;
    private String type;
}
