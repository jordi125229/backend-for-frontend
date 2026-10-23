package com.final_project.back_end_for_front_end.dtos.productDtos;

import java.util.Set;

public class ProductDto {
    private Long id;
    private String name;
    private Price price;
    private String type;
    private Integer quantity;
    private Set<ProductOptionDto> options;
}
