package com.task.mockserver.cis.controller;

import com.task.mockserver.cis.service.CISService;
import com.task.mockserver.cis.dto.CustomerSubscriptionResponse;
import com.task.mockserver.cis.dto.SubscriptionData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CISController {

    private final CISService cisService;

    @GetMapping("/{ID}/subscriptions")
    public Flux<CustomerSubscriptionResponse> getCustomerSubscriptions(
            @PathVariable("ID") String customerId,
            @RequestHeader(value = "transactionId", required = false) String transactionId
    ) {
        log.info("transactionId: {}", transactionId);
        return cisService.getCustomerSubscriptions(customerId);
    }

    @GetMapping("/subscriptions/{subscriptionId}")
    public Mono<SubscriptionData> getSubscriptionById(
            @PathVariable("subscriptionId") String subscriptionId,
            @RequestHeader(value = "transactionId", required = false) String transactionId
    ) {
        log.info("transactionId: {}", transactionId);
        return cisService.getSubscriptionById(subscriptionId);
    }
}