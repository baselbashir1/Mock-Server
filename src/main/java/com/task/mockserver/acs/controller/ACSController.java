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
        return ResponseEntity.ok().body(response);
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
    }

    @PostMapping(value = "/v1.3/Products/BundlePrice", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getBundlePrice(HttpServletRequest request) {
        String response = """
                {
                    "data": {
                        "dataCost": 10,
                        "voiceOnnetCost": 10,
                        "voiceOffnetCost": 10,
                        "smsOnnetCost": 10,
                        "smsOffnetCost": 10,
                        "totalCost": 80
                    },
                    "success": true,
                    "message": "string",
                    "statusCode": 0,
                    "transactionId": 0
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/v1.2/Transfer", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> dataGifting(HttpServletRequest request) {
        String response = """
                {
                    "data": {
                        "sender": "23114234234",
                        "receiver": "23114235577",
                        "amount": 580,
                        "packageTransferred": {
                            "productName": "basel-prd",
                            "cost": 780,
                            "productId": 1230,
                            "categoryId": 4320,
                            "categoryName": "basel-crt",
                            "description": "dasdasdsad",
                            "validityDays": 10,
                            "type": "test",
                            "validityHours": 900,
                            "costCurrency": {
                                "additionalProp1": 0,
                                "additionalProp2": 0,
                                "additionalProp3": 0
                            }
                        },
                        "packageReceived": {
                            "productName": "basel-prd",
                            "cost": 230,
                            "productId": 2031,
                            "categoryId": 40,
                            "categoryName": "basel-crt",
                            "description": "sasd",
                            "validityDays": 3,
                            "type": "grrr",
                            "validityHours": 550,
                            "costCurrency": {
                                "additionalProp1": 0,
                                "additionalProp2": 0,
                                "additionalProp3": 0
                            }
                        },
                        "transferExpiry": "2026-02-12T08:29:48.561Z"
                    },
                    "success": true,
                    "message": "success",
                    "statusCode": 0,
                    "transactionId": 0
                }
                """;
        return ResponseEntity.ok().body(response);
//        return ResponseEntity.ok().body(null);
//        return ResponseEntity.badRequest().body(response);
//        return ResponseEntity.internalServerError().body(response);
//        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }

    @PostMapping(value = "/v1.3/Linked/AddDevice", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addMiFiNumber(HttpServletRequest request) {
        String response = """
                {
                    "data": {
                        "linkedId": 0,
                        "msisdn": "string",
                        "deviceNumber": "string",
                        "deviceType": "string",
                        "dateLinked": "2026-02-12T07:45:28.616Z",
                        "lastModified": "2026-02-12T07:45:28.616Z"
                    },
                    "success": true,
                    "message": "string",
                    "statusCode": 0,
                    "transactionId": 0
                }
                """;
        return ResponseEntity.ok().body(response);
//        return ResponseEntity.ok().body(null);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        return ResponseEntity.badRequest().body(response);
//        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
//        return ResponseEntity.internalServerError().body(response);
    }

    @DeleteMapping(value = "/v1.3/Linked/DeleteDevice", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> removeMiFiNumber(HttpServletRequest request) {
        String response = """
                {
                    "data": {
                        "linkedId": 0,
                        "msisdn": "string",
                        "deviceNumber": "string",
                        "deviceType": "string",
                        "dateLinked": "2026-02-12T07:50:14.057Z",
                        "lastModified": "2026-02-12T07:50:14.057Z"
                    },
                    "success": true,
                    "message": "string",
                    "statusCode": 0,
                    "transactionId": 0
                }
                """;
        return ResponseEntity.ok().body(response);
//        return ResponseEntity.ok().body(null);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        return ResponseEntity.badRequest().body(response);
//        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
//        return ResponseEntity.internalServerError().body(response);
    }

    @PostMapping(value = "/v1.3/Linked/GetDevices", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> fetchMiFiNumber(HttpServletRequest request) {
        String response = """
                {
                     "data": [
                         {
                             "linkedId": 0,
                             "msisdn": "string",
                             "deviceNumber": "string",
                             "deviceType": "string",
                             "dateLinked": "2026-02-12T07:51:05.897Z",
                             "lastModified": "2026-02-12T07:51:05.897Z"
                         }
                     ],
                     "success": true,
                     "message": "string",
                     "statusCode": 0,
                     "transactionId": 0
                 }
                """;
        return ResponseEntity.ok().body(response);
//        return ResponseEntity.ok().body(null);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        return ResponseEntity.badRequest().body(response);
//        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
//        return ResponseEntity.internalServerError().body(response);
    }

    @PostMapping(value = "/v1.2/SelfSimService/SwapSim", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> swapSim(HttpServletRequest request) {
        String response = """
                {
                    "data": {
                        "message": "string",
                        "success": true
                    },
                    "success": true,
                    "message": "string",
                    "statusCode": 0,
                    "transactionId": 0
                }
                """;
        return ResponseEntity.ok().body(response);
//        return ResponseEntity.ok().body(null);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        return ResponseEntity.badRequest().body(response);
//        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
//        return ResponseEntity.internalServerError().body(response);
    }
}