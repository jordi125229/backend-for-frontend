package com.final_project.back_end_for_front_end.dtos.orderDtos;

import java.math.BigDecimal;

public class OrderItemPriceDto {
    private BigDecimal grossPrice;
    private BigDecimal netPrice;
    private Double taxRate;
}
