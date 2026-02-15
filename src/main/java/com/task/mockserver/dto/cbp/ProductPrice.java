package com.task.mockserver.dto.cbp;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductPrice {
    private String priceType;
    private Price price;
}