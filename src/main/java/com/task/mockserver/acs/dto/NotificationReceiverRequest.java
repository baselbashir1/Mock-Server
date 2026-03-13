package com.task.mockserver.acs.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationReceiverRequest {
    private String appId;
    private String msisdn;
    private String partyB;
}