package com.final_project.back_end_for_front_end.dtos.cartDtos;

import java.math.BigDecimal;
import java.util.Map;

public class CartPriceDto {
    private BigDecimal totalNetPrice;
    private Map<BigDecimal, BigDecimal> vatByRate;
    private BigDecimal totalGrossPrice;
}
