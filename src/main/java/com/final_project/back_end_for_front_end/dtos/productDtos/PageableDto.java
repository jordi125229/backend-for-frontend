package com.final_project.back_end_for_front_end.dtos.productDtos;

import java.util.List;

public class PageableDto<T> {
    private List<T> content;
    private Integer pageSize;
    private Integer pageNumber;
    private Long total;
    private Integer totalPages;
}
