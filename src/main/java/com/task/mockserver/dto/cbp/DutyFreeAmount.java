package com.task.mockserver.dto.cbp;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DutyFreeAmount {
    private String unit;
    private String value;
}