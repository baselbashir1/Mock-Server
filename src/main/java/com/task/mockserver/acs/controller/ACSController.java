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
@RequestMapping("/api")
@RequiredArgsConstructor
public class ACSController {

    @PostMapping(value = "/v1.2/Refill/topUpVoucher", produces = MediaType.APPLICATION_JSON_VALUE)
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

    @PostMapping(value = "/v1.2/SelfSimService/ChangePin", produces = MediaType.APPLICATION_JSON_VALUE)
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

    @PostMapping(value = "/v1.3/Products/BundleRates", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> bundlesRates() {
        String response = """
                {
                    "data": {
                        "DataRate": [
                            {
                                "MinVolume": 0,
                                "MaxVolume": 0,
                                "Rate": 0
                            }
                        ],
                        "VoiceOnnet": [
                            {
                                "MinVolume": 0,
                                "MaxVolume": 0,
                                "Rate": 0
                            }
                        ],
                        "VoiceOffnet": [
                            {
                                "MinVolume": 0,
                                "MaxVolume": 0,
                                "Rate": 0
                            }
                        ],
                        "SmsOnnet": [
                            {
                                "MinVolume": 0,
                                "MaxVolume": 0,
                                "Rate": 0
                            }
                        ],
                        "SmsOffnet": [
                            {
                                "MinVolume": 0,
                                "MaxVolume": 0,
                                "Rate": 0
                            }
                        ]
                    },
                    "success": true,
                    "message": "basel",
                    "statusCode": "888",
                    "transactionId": "hgugiughuyh"
                }
                """;
        return ResponseEntity.ok().body(response);
    }
}