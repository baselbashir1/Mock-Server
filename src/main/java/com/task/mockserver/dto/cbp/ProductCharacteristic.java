package com.task.mockserver.dto.cbp;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductCharacteristic {
    private String name;
    private String value;
}