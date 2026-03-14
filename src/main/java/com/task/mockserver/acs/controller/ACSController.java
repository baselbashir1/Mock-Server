package com.task.mockserver.acs.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ACSController {

    @PostMapping(value = "/v1.2/Refill/topUpVoucher", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSubscriptionDetails(@RequestHeader String Authorization, HttpServletRequest request) {
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
    public ResponseEntity<?> changePinCode(HttpServletRequest request) {
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

    @PostMapping(value = "/v1.2/Notifications/receiver", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registerNotificationReceiver(HttpServletRequest request) {
        String response = """
                {
                    "data": {
                        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
                        "msisdn": "23108548",
                        "partyBMsisdn": "asdasd",
                        "appId": "add"
                    },
                    "success": true,
                    "message": "basel",
                    "statusCode": "0000",
                    "transactionId": "basel"
                }
                """;
//        return ResponseEntity.ok().body(response);
//        return ResponseEntity.badRequest().body(response);
//        return ResponseEntity.internalServerError().body(response);
//        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @PutMapping(value = "/v1.2/Notifications/receiver/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registerNotificationReceiver(@PathVariable String id, HttpServletRequest request) {
        String response = """
                {
                    "data": {
                        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
                        "msisdn": "23108548",
                        "partyBMsisdn": "asdasd",
                        "appId": "update"
                    },
                    "success": true,
                    "message": "basel",
                    "statusCode": "0000",
                    "transactionId": "basel"
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping(value = "/v1.2/Notifications/receiver/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteNotificationReceiver(@PathVariable String id) {
        String response = """
                {
                    "data": {
                        "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
                        "msisdn": "23108548",
                        "partyBMsisdn": "asdasd",
                        "appId": "delete"
                    },
                    "success": true,
                    "message": "basel",
                    "statusCode": "0000",
                    "transactionId": "basel"
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/v1.3/Provision/Subscribe", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> subscribeFreeBonus(HttpServletRequest request) {
        String response = """
                {
                    "data": {
                        "product": {
                            "productName": "30LD-80MB 24hrs",
                            "cost": 0,
                            "productId": 368,
                            "categoryId": 228,
                            "categoryName": "",
                            "description": "Get 80MB of data to browse the internet valid for 24hrs.",
                            "validityDays": 1,
                            "type": "Data",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0,
                                "LRD": 30
                            }
                        },
                        "expiryDate": "2026-02-13T15:55:32.3052778+00:00"
                    },
                    "success": true,
                    "message": "Congratulations! You have received 80MB to browse the internet. Welcome to the new Liberia",
                    "statusCode": 0,
                    "transactionId": 881202865646894300
                }
                """;
        return ResponseEntity.ok().body(response);
//        return ResponseEntity.badRequest().body(response);
//        return ResponseEntity.internalServerError().body(response);
//        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }
}