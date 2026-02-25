package com.task.mockserver.acs.controller;

import com.task.mockserver.acs.dto.ChangeCustomerPinRequest;
import com.task.mockserver.acs.dto.RefillRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ACSController {

    @PostMapping(value = "/api/v1.2/Refill/topUpVoucher", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSubscriptionDetails(@RequestHeader String Authorization,
                                                    @RequestBody RefillRequest refillRequest) {
        String response = """
                {
                    "serialNumber": "283437298374",
                    "currency": "USD",
                    "group": "basel",
                    "amount": 0
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/api/v1.2/SelfSimService/ChangePin", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> changePinCode(@RequestBody ChangeCustomerPinRequest changeCustomerPinRequest) {
        String response = """
                {
                    "data": {
                        "message": "basel",
                        "success": true
                    },
                    "success": true,
                    "message": "basel",
                    "statusCode": "07",
                    "transactionId": "0123213"
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/connect/token", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> token(@RequestParam String client_id,
                                   @RequestParam String client_secret,
                                   @RequestParam String scope,
                                   @RequestParam String grant_type) {
        String response = """
                {
                  "data": {
                    "sessionToken": "BASEL_TOKEN"
                  }
                }
                """;
        return ResponseEntity.ok().body(response);
    }
}