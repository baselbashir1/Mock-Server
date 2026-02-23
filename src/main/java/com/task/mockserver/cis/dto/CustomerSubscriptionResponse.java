package com.task.mockserver.cis.dto;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomerSubscriptionResponse {
    private String customerId;
    private SubscriptionData[] subscriptions;
}