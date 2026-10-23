package com.final_project.back_end_for_front_end.feignClients;

import com.final_project.back_end_for_front_end.dtos.productDtos.PageableDto;
import com.final_project.back_end_for_front_end.dtos.productDtos.ProductDto;
import com.final_project.back_end_for_front_end.dtos.productDtos.ProductOptionDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "products-service", url = "${PRODUCT_SERVICE_URL}")
public interface ProductsFeignClient {

    @GetMapping
    PageableDto<ProductDto> getProducts(@RequestParam int page, @RequestParam int size);

    @GetMapping("/options/{id}")
    PageableDto<ProductOptionDto> getOptions(@RequestParam int page, @RequestParam int size,
                                             @PathVariable Long id);

}
