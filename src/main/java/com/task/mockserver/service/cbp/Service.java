package com.task.mockserver.service.cbp;

import com.task.mockserver.dto.cbp.*;

import java.time.LocalDateTime;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    public static List<SubscriptionDetailsResponse> buildResponse() {
        DutyFreeAmount dutyFreeAmount = new DutyFreeAmount();
        dutyFreeAmount.setUnit("K");
        dutyFreeAmount.setValue("451.0");

        Price price = new Price();
        price.setDutyFreeAmount(dutyFreeAmount);

        ProductPrice productPrice = new ProductPrice();
        productPrice.setPriceType("ONETIME");
        productPrice.setPrice(price);

        ProductCharacteristic characteristic = new ProductCharacteristic();
        characteristic.setName("paymentMode");
        characteristic.setValue("MoMO");

        RealizingResource resource = new RealizingResource();
        resource.setId("9371987370");
        resource.setType("resourceNumber");

        ProductOffering offering = new ProductOffering();
        offering.setId("USEmb_Post_Hybrid_USG_500");

        SubscriptionDetailsResponse response = new SubscriptionDetailsResponse();
        response.setId("0094579689186968162693432801636549265864");
        response.setStatus("active");
        response.setStartDate(LocalDateTime.parse("2024-08-14T06:54:58"));
        response.setTerminationDate(LocalDateTime.parse("2024-12-14T06:54:58"));
        response.setProductOffering(offering);
        response.setProductPrice(List.of(productPrice));
        response.setProductCharacteristic(List.of(characteristic));
        response.setRealizingResource(List.of(resource));

        return List.of(response);
    }
}