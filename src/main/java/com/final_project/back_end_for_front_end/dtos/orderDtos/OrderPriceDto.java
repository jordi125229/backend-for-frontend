package com.final_project.back_end_for_front_end.dtos.orderDtos;

import java.math.BigDecimal;
import java.util.Map;

public class OrderPriceDto {
    private BigDecimal totalGrossPrice;
    private BigDecimal totalNetPrice;
    private Map<BigDecimal, BigDecimal> vatByRate;
}
