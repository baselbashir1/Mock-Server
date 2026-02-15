package com.task.mockserver.dto.cbp;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionDetailsResponse {
    private String id;
    private String status;
    private LocalDateTime startDate;
    private LocalDateTime terminationDate;
    private ProductOffering productOffering;
    private List<ProductPrice> productPrice;
    private List<ProductCharacteristic> productCharacteristic;
    private List<RealizingResource> realizingResource;
}