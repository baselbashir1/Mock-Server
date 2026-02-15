package com.task.mockserver.dto;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionData {
    private String subscriptionId;
    private String type;
    private boolean status;
}