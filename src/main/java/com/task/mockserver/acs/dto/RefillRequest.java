package com.task.mockserver.acs.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RefillRequest {
    private String msisdn;
    private String voucherCode;
}