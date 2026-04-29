package com.task.mockserver.acs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ACSController {

    @PostMapping(value = "/v1.2/Refill/topUpVoucher", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSubscriptionDetails(@RequestHeader String Authorization) {
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
    public ResponseEntity<?> changePinCode() {
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
    public ResponseEntity<?> registerNotificationReceiver() {
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
    public ResponseEntity<?> registerNotificationReceiver(@PathVariable String id) {
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
    public ResponseEntity<?> subscribeFreeBonus() {
        String response = """
                {
                    "data": {
                        "product": {
                            "productName": "$0.35-100MB-1Day",
                            "cost": 0.35,
                            "productId": 15,
                            "categoryId": 158,
                            "categoryName": "",
                            "description": "You have selected $0.35-100MB Package valid 24hrs.",
                            "validityDays": 1,
                            "type": "Data",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.35,
                                "LRD": 63.62
                            }
                        },
                        "expiryDate": "2026-04-23T09:38:15"
                    },
                    "success": true,
                    "message": "You have successfully extended your $0.35-100MB-1Day valid till 4/23/2026 at 9:38 AM.",
                    "statusCode": 0,
                    "transactionId": 887289233951815329
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/v1.3/Products/BundlePrice", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> calculateBundlePrice() {
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
    public ResponseEntity<?> dataGifting() {
        String response = """
                {
                     "data": {
                         "sender": "231887289233",
                         "receiver": "231889529877",
                         "amount": 200,
                         "packageTransferred": {
                             "productName": "$0.35-100MB-1Day",
                             "cost": 0.35,
                             "productId": 15,
                             "categoryId": 158,
                             "categoryName": "",
                             "description": "You have selected $0.35-100MB Package valid 24hrs.",
                             "validityDays": 1,
                             "type": "Data",
                             "validityHours": 24,
                             "costCurrency": {
                                 "USD": 0.35,
                                 "LRD": 63.62
                             }
                         },
                         "packageReceived": {
                             "productName": "$0.35-100MB-1Day",
                             "cost": 0,
                             "productId": 15,
                             "categoryId": 0,
                             "categoryName": "",
                             "description": null,
                             "validityDays": 0,
                             "type": "Unknown",
                             "validityHours": 0,
                             "costCurrency": {
                                 "USD": 0,
                                 "LRD": 0
                             }
                         },
                         "transferExpiry": "2026-05-31T11:11:32"
                     },
                     "success": true,
                     "message": "Transfer Successful",
                     "statusCode": 200,
                     "transactionId": 741258
                 }
                """;
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/v1.3/Linked/AddDevice", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addMiFiNumber() {
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
    }

    @DeleteMapping(value = "/v1.3/Linked/DeleteDevice", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> removeMiFiNumber() {
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
    }

    @PostMapping(value = "/v1.3/Linked/GetDevices", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> fetchMiFiNumber() {
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
    }

    @PostMapping(value = "/v1.2/SelfSimService/SwapSim", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> swapSim() {
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
    }

    @PostMapping(value = "/v1.3/Provision/SubscribeMmp", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> activateMyPackage() {
        String response = """
                {
                    "data": {
                        "success": true,
                        "message": "Congratulations! You have successfully purchased $23.45-100mins-100mins-100sms-100sms-100mb. Dial *124# to check your balance",
                        "statusCode": 200,
                        "transactionId": 123456,
                        "extraData": null,
                        "externalData": "",
                        "product": {
                            "fetchedParameters": false,
                            "productId": 1510,
                            "productName": "$23.45-100mins-100mins-100sms-100sms-100mb",
                            "categoryId": 286,
                            "menuCode": 1,
                            "message": "You have successfully purchased {ProductName} non-expiry bundle. Dial *124# to check your balance",
                            "pamid": 0,
                            "daid": 0,
                            "offerid": 1838,
                            "validity": 365,
                            "maxRetries": 1000000,
                            "appId": "MMP",
                            "maCostDollarsThirdParty": 0,
                            "maCostDollars": 23.45,
                            "maCostLRD": 0.00,
                            "menuPosition": 0,
                            "active": true,
                            "balanceMessageFormat": "You have {balance} on your Make your own package. Visit myMTN app to buy more bundle",
                            "confirmationMessageFormat": "",
                            "messageUSSD": "Congratulations! You have successfully purchased {ProductName}. Dial *124# to check your balance",
                            "maxValidityExt": 356,
                            "exchangeRate": 0,
                            "productProvisioningDetails": null,
                            "reportingName": "MakeMyPackage",
                            "requireConfirmation": true,
                            "productType": "3",
                            "isTransferable": false,
                            "canExtend": true,
                            "smsCode": null,
                            "allowedChannels": [
                                "USSD",
                                "FlytxtPromoSms"
                            ]
                        },
                        "expiryForProvisioning": null,
                        "ucipOutputs": []
                    },
                    "success": true,
                    "message": "Congratulations! You have successfully purchased $23.45-100mins-100mins-100sms-100sms-100mb. Dial *124# to check your balance",
                    "statusCode": 200,
                    "transactionId": 123456
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/v1.2/SelfSimService/UpdateAlternateNumber", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateAlternateNumber() {
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