package com.task.mockserver.dto.cis;

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