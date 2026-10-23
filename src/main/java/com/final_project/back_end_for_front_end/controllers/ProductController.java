package com.final_project.back_end_for_front_end.controllers;

import com.final_project.back_end_for_front_end.dtos.productDtos.PageableDto;
import com.final_project.back_end_for_front_end.dtos.productDtos.ProductDto;
import com.final_project.back_end_for_front_end.dtos.productDtos.ProductOptionDto;
import com.final_project.back_end_for_front_end.feignClients.ProductsFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductsFeignClient productsFeignClient;

    @GetMapping
    public PageableDto<ProductDto> getProducts(@RequestParam int page, @RequestParam int size){
        return productsFeignClient.getProducts(page, size);
    }

    @GetMapping("/options")
    public PageableDto<ProductOptionDto> getOptions(@RequestParam int page, @RequestParam int size,
                                                    @PathVariable Long productId){
        return productsFeignClient.getOptions(page, size, productId);
    }
}
