package com.task.mockserver.acs.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChangeCustomerPinRequest {
    private String subscriber;
    private String oldPin;
    private String newPin;
}