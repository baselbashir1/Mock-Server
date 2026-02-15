package com.task.mockserver.controller;

import com.task.mockserver.dto.CustomerSubscriptionResponse;
import com.task.mockserver.dto.SubscriptionData;
import com.task.mockserver.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{ID}/subscriptions")
    public Flux<CustomerSubscriptionResponse> getCustomerSubscriptions(
            @PathVariable("ID") String customerId,
            @RequestHeader(value = "transactionId", required = false) String transactionId
    ) {
        log.info("transactionId: {}", transactionId);
        return customerService.getCustomerSubscriptions(customerId);
    }

    @GetMapping("/subscriptions/{subscriptionId}")
    public Mono<SubscriptionData> getSubscriptionById(
            @PathVariable("subscriptionId") String subscriptionId,
            @RequestHeader(value = "transactionId", required = false) String transactionId
    ) {
        log.info("transactionId: {}", transactionId);
        return customerService.getSubscriptionById(subscriptionId);
    }
}