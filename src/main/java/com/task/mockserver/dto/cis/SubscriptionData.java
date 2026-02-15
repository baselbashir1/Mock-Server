package com.task.mockserver.dto.cis;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionData {
    private String subscriptionId;
    private String type;
    private boolean status;
}