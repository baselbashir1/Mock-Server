package com.task.mockserver.service;

import com.task.mockserver.exception.NotFoundException;
import com.task.mockserver.dto.CustomerSubscriptionResponse;
import com.task.mockserver.dto.SubscriptionData;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    private static final List<CustomerSubscriptionResponse> DATA = Arrays.asList(
            CustomerSubscriptionResponse.builder()
                    .customerId("26011234567")
                    .subscriptions(new SubscriptionData[]{
                            SubscriptionData.builder()
                                    .subscriptionId("subscription1")
                                    .type("type1")
                                    .status(true)
                                    .build(),
                            SubscriptionData.builder()
                                    .subscriptionId("subscription2")
                                    .type("type2")
                                    .status(false)
                                    .build()
                    })
                    .build(),
            CustomerSubscriptionResponse.builder()
                    .customerId("26012345678")
                    .subscriptions(new SubscriptionData[]{
                            SubscriptionData.builder()
                                    .subscriptionId("subscription3")
                                    .type("type3")
                                    .status(true)
                                    .build()
                    })
                    .build()
    );

    public Flux<CustomerSubscriptionResponse> getCustomerSubscriptions(String customerId) {
        return Flux.fromIterable(DATA)
                .filter(customer -> customerId.equals(customer.getCustomerId()));
    }

    public Mono<SubscriptionData> getSubscriptionById(String subscriptionId) {
        return Flux.fromIterable(DATA)
                .flatMap(customer -> Flux.fromArray(customer.getSubscriptions()))
                .filter(subscription -> subscriptionId.equals(subscription.getSubscriptionId()))
                .next()
                .switchIfEmpty(Mono.error(new NotFoundException("Not Found")));
    }
}