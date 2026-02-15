package com.task.mockserver.dto.cbp;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    private DutyFreeAmount dutyFreeAmount;
}