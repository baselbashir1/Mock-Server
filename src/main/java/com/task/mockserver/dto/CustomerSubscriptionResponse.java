package com.task.mockserver.dto;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomerSubscriptionResponse {
    private String customerId;
    private SubscriptionData[] subscriptions;
}