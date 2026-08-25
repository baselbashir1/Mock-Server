package com.task.mockserver.acs;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ACSController {

    @PostMapping(value = "/v1.2/Refill/topUpVoucher", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSubscriptionDetails(@RequestHeader String Authorization) {
        String oldResponse = """
                {
                    "serialNumber": "283437298374",
                    "currency": "USD",
                    "group": "basel",
                    "amount": 0
                }
                """;

        String successResponse = """
                {
                    "success": true,
                    "responseCode": 1,
                    "responseMessage": "",
                    "failureReason": null,
                    "serialNumber": "1374650809",
                    "currency": "USD",
                    "group": "14",
                    "amount": 1
                }
                """;

        String alreadyUsedResponse = """
                {
                    "success": false,
                    "responseCode": 108,
                    "responseMessage": "",
                    "failureReason": "Voucher already used by another subscriber",
                    "serialNumber": null,
                    "currency": null,
                    "group": null,
                    "amount": 0
                }
                """;

        String badRequestResponse = """
                {
                    "success": false,
                    "responseCode": 400,
                    "responseMessage": "Invalid voucher code",
                    "failureReason": "Voucher code must be 13 characters",
                    "serialNumber": null,
                    "currency": null,
                    "group": null,
                    "amount": 0
                }
                """;

        String invalidVoucher = """
                {
                    "success": false,
                    "responseCode": 119,
                    "responseMessage": "",
                    "failureReason": "Invalid voucher code",
                    "serialNumber": null,
                    "currency": null,
                    "group": null,
                    "amount": 0
                }
                """;

        return ResponseEntity.ok().body(invalidVoucher);
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
    public ResponseEntity<?> updateNotificationReceiver(@PathVariable String id) {
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
        String successResponse = """
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

        String failureResponse = """
                {
                    "data": null,
                    "success": false,
                    "message": "Error Transferring Product ",
                    "statusCode": 400,
                    "transactionId": 741258
                }
                """;
        return ResponseEntity.ok().body(successResponse);
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
        String successResponse = """
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

        String failureResponse = """
                {
                    "data": {
                        "success": false,
                        "message": "You do not have sufficient balance to activate this service.",
                        "statusCode": 200,
                        "transactionId": 123456,
                        "extraData": null,
                        "externalData": "",
                        "product": {
                            "fetchedParameters": false,
                            "productId": 1510,
                            "productName": "MakeMyPackage",
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
                                "FlytxtPromoSms",
                                "OPTASIA-LOAN-ENABLED"
                            ]
                        },
                        "expiryForProvisioning": null,
                        "ucipOutputs": []
                    },
                    "success": false,
                    "message": "You do not have sufficient balance to activate this service.",
                    "statusCode": 0,
                    "transactionId": null
                }
                """;

        String notEligibleResponse = """
                {
                    "message": "Subscriber Not Eligible for a Make My Package bundle",
                    "success": false,
                    "statusCode": "406",
                    "transactionId": "0"
                }
                """;
        return ResponseEntity.ok().body(notEligibleResponse);
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

    @PostMapping(value = "/v1.3/Products/Balances", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> checkBalance(@RequestBody Map<String, Object> requestBody) {

        if (requestBody.containsKey("type") && requestBody.get("type") == null) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("success", false);
            errorResponse.put("message", "type parameter should be null or not provided");
            errorResponse.put("statusCode", 400);
            return ResponseEntity.badRequest().body(errorResponse);
        }

        String response = """
                {
                    "data": {
                        "dataBalance": 7764119,
                        "voiceOnnet": 0,
                        "voiceOffnet": 0,
                        "smsOnnet": 0,
                        "smsOffnet": 0,
                        "international": 0,
                        "money": 0
                    },
                    "success": true,
                    "message": "You have 7764119MB, 0Mins MTN to MTN, 0Mins MTN to other networks, 0SMS MTN to MTN and 0SMS to other networks",
                    "statusCode": 200,
                    "transactionId": 112345
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/v1.3/Products/Bundles", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> productBundles() {
        String response = """
                {
                    "data": [
                        {
                            "productName": "",
                            "cost": 0,
                            "productId": 0,
                            "categoryId": 0,
                            "categoryName": "",
                            "description": "",
                            "validityDays": 0,
                            "type": "Content",
                            "validityHours": 0,
                            "costCurrency": {}
                        }
                    ],
                    "success": true,
                    "message": "",
                    "statusCode": 0,
                    "transactionId": null
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(value = "/v1.3/Balance/all/{msisdn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> retrieveAllSubscriberBalances(@PathVariable String msisdn) {
        String response = """
                {
                    "data": {
                        "msisdn": "231880600175",
                        "data": {
                            "formattedBalance": "7.40 TB",
                            "rawBalance": 7763128,
                            "expiryDate": "2038-01-19T11:33:28"
                        },
                        "voice": {
                            "onNet": 0,
                            "offNet": 0,
                            "international": 0,
                            "onNetExpiryDate": null,
                            "offNetExpiryDate": null,
                            "intlExpiryDate": null
                        },
                        "sms": {
                            "onNet": 0,
                            "offNet": 0,
                            "onNetExpiryDate": null,
                            "offNetExpiryDate": null
                        },
                        "airtime": {
                            "balance": 0,
                            "currency": "USD",
                            "lastUpdated": "2026-07-07T09:11:29.0518964Z"
                        }
                    },
                    "success": true,
                    "message": "Success",
                    "statusCode": 0,
                    "transactionId": null
                }
                """;

        String newResponse = """
                {
                    "data": {
                        "msisdn": "231880600175",
                        "data": {
                            "formattedBalance": "7.40 TB",
                            "rawBalance": 7763128,
                            "expiryDate": "2038-01-19T11:33:28"
                        },
                        "voice": {
                            "onNet": 0,
                            "offNet": 0,
                            "international": 0,
                            "onNetExpiryDate": null,
                            "offNetExpiryDate": null,
                            "intlExpiryDate": null
                        },
                        "sms": {
                            "onNet": 0,
                            "offNet": 0,
                            "onNetExpiryDate": null,
                            "offNetExpiryDate": null
                        },
                        "airtime": {
                            "balance": 0,
                            "currency": "USD",
                            "lastUpdated": "2026-07-09T18:23:08.461961Z"
                        },
                        "account": {
                            "serviceClass": 50,
                            "serviceClassName": null,
                            "accountType": "Prepaid",
                            "activationDate": null
                        }
                    },
                    "success": true,
                    "message": "Success",
                    "statusCode": 0,
                    "transactionId": null
                }
                """;
        return ResponseEntity.ok().body(newResponse);
    }

    @PostMapping(value = "/v1.2/Provision/Subscribe", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> subscribe() {
        String successResponse = """
                {
                    "data": [
                        {
                            "productName": "$30-Prestige",
                            "cost": 30,
                            "productId": 1324,
                            "categoryId": 162,
                            "categoryName": "Prestige bundles(30 days)",
                            "description": "21GB,550mins-MTN,500mins-all networks,50mins-Int'l + more",
                            "validityDays": 30,
                            "type": "Combo",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 30,
                                "LRD": 5492.50
                            }
                        },
                        {
                            "productName": "$1-70mins-50MB-5Days",
                            "cost": 1,
                            "productId": 98,
                            "categoryId": 22,
                            "categoryName": "DYO",
                            "description": "Get 60mins to call MTN numbers, 10 all-net mins to call all networks, 50MB Data + Unlimited SMS to all MTN numbers. Press 1 to confirm 2 to cancel.",
                            "validityDays": 5,
                            "type": "Combo",
                            "validityHours": 120,
                            "costCurrency": {
                                "USD": 1,
                                "LRD": 183.08
                            }
                        },
                        {
                            "productName": "$5-13GB",
                            "cost": 5,
                            "productId": 20,
                            "categoryId": 6,
                            "categoryName": "Weekly",
                            "description": "You have selected $5 - 13GB Package valid 7 days.",
                            "validityDays": 7,
                            "type": "Data",
                            "validityHours": 168,
                            "costCurrency": {
                                "USD": 5,
                                "LRD": 915.42
                            }
                        },
                        {
                            "productName": "50LD-16mins-24hrs",
                            "cost": 0.27,
                            "productId": 243,
                            "categoryId": 229,
                            "categoryName": "Voice Bundle",
                            "description": "Get 12 mins calls to MTN numbers,4mins calls to all networks, 10MB Data and 50 SMS onnet for 24hrs",
                            "validityDays": 1,
                            "type": "Voice",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.27,
                                "LRD": 50
                            }
                        },
                        {
                            "productName": "$2-1.8GB-10Days",
                            "cost": 2,
                            "productId": 19,
                            "categoryId": 6,
                            "categoryName": "Weekly",
                            "description": "You have selected $2-1.8GB Package valid 7 days.",
                            "validityDays": 10,
                            "type": "Data",
                            "validityHours": 240,
                            "costCurrency": {
                                "USD": 2,
                                "LRD": 366.17
                            }
                        },
                        {
                            "productName": "$20-25GB",
                            "cost": 20,
                            "productId": 22,
                            "categoryId": 6,
                            "categoryName": "Weekly",
                            "description": "You have selected $20-25GB Package valid 7 days.",
                            "validityDays": 7,
                            "type": "Data",
                            "validityHours": 168,
                            "costCurrency": {
                                "USD": 20,
                                "LRD": 3661.67
                            }
                        },
                        {
                            "productName": "$0.35-100MB-1Day",
                            "cost": 0.35,
                            "productId": 15,
                            "categoryId": 158,
                            "categoryName": "Daily",
                            "description": "You have selected $0.35-100MB Package valid 24hrs.",
                            "validityDays": 1,
                            "type": "Data",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.35,
                                "LRD": 64.08
                            }
                        },
                        {
                            "productName": "190LD-70mins-5days",
                            "cost": 1.04,
                            "productId": 1663,
                            "categoryId": 229,
                            "categoryName": "Voice Bundle",
                            "description": "Get 70mins On net and 20mins all net plus 50MB data and Unlimited SMS valid for 5 days",
                            "validityDays": 5,
                            "type": "Voice",
                            "validityHours": 120,
                            "costCurrency": {
                                "USD": 1.04,
                                "LRD": 190
                            }
                        },
                        {
                            "productName": "200LD-50mins-7days",
                            "cost": 1.09,
                            "productId": 11,
                            "categoryId": 229,
                            "categoryName": "Voice Bundle",
                            "description": "Get 40 mins calls to MTN numbers, 10mins allnet calls to all networks plus 200MB data and 1000 SMS valid for 7 days",
                            "validityDays": 7,
                            "type": "Voice",
                            "validityHours": 168,
                            "costCurrency": {
                                "USD": 1.09,
                                "LRD": 200
                            }
                        },
                        {
                            "productName": "1000LD-355mins-30days",
                            "cost": 5.46,
                            "productId": 1664,
                            "categoryId": 229,
                            "categoryName": "Voice Bundle",
                            "description": "Get 300 mins calls to MTN numbers, 55mins all  networks, 50MB Data and Unlimited SMS valid for 30 days",
                            "validityDays": 30,
                            "type": "Voice",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 5.46,
                                "LRD": 1000
                            }
                        },
                        {
                            "productName": "$10-Prestige",
                            "cost": 10,
                            "productId": 348,
                            "categoryId": 162,
                            "categoryName": "Prestige bundles(30 days)",
                            "description": "6GB,200mins-MTN,80mins-all networks + more",
                            "validityDays": 30,
                            "type": "Combo",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 10,
                                "LRD": 1830.84
                            }
                        },
                        {
                            "productName": "$5-179mins-30Days",
                            "cost": 5,
                            "productId": 1661,
                            "categoryId": 327,
                            "categoryName": "FreedomVoice",
                            "description": "Get 179 mins calls to MTN numbers. Press 1 to confirm 0 to cancel.",
                            "validityDays": 30,
                            "type": "Voice",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 5,
                                "LRD": 915.42
                            }
                        },
                        {
                            "productName": "$0.20-14mins-10MB-1Day",
                            "cost": 0.20,
                            "productId": 1444,
                            "categoryId": 22,
                            "categoryName": "DYO",
                            "description": "Get 14 mins to calls MTN numbers,10MB Data + 15 SMS to all MTN numbers. Press 1 to confirm 2 to cancel.",
                            "validityDays": 1,
                            "type": "Combo",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.20,
                                "LRD": 36.62
                            }
                        },
                        {
                            "productName": "30LD-8mins-24hrs",
                            "cost": 0.16,
                            "productId": 1675,
                            "categoryId": 229,
                            "categoryName": "Voice Bundle",
                            "description": "Get 8 mins calls to MTN numbers and 20 SMS valid for 24hrs.",
                            "validityDays": 1,
                            "type": "Voice",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.16,
                                "LRD": 30
                            }
                        },
                        {
                            "productName": "$5-Prestige",
                            "cost": 5,
                            "productId": 347,
                            "categoryId": 162,
                            "categoryName": "Prestige bundles(30 days)",
                            "description": "2.05GB,200mins-MTN,50mins-all networks,20mins-Int'l + more",
                            "validityDays": 30,
                            "type": "Combo",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 5,
                                "LRD": 915.42
                            }
                        },
                        {
                            "productName": "$0.50-21mins-4mins-20sms-20mb-24hrs",
                            "cost": 0.50,
                            "productId": 1518,
                            "categoryId": 288,
                            "categoryName": "DYOFallback",
                            "description": "You have less than $1.00, activate 0.50cent offer to get 21mins (On-net), 4mins(ofnet), 20sms(0nnet) and 20mb(data) valid 24HRS. Please enter 1 to confirm and 2 to cancel",
                            "validityDays": 1,
                            "type": "Combo",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.50,
                                "LRD": 91.54
                            }
                        },
                        {
                            "productName": "10LD-2mins-24hrs",
                            "cost": 0.05,
                            "productId": 365,
                            "categoryId": 229,
                            "categoryName": "Voice Bundle",
                            "description": "Get 2 mins calls to MTN numbers and 5 SMS valid for 24hrs.",
                            "validityDays": 1,
                            "type": "Voice",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.05,
                                "LRD": 10
                            }
                        },
                        {
                            "productName": "$0.50-40mins-50MB-1Day",
                            "cost": 0.50,
                            "productId": 1443,
                            "categoryId": 22,
                            "categoryName": "DYO",
                            "description": "Get 30 mins to calls MTN numbers,10 mins calls to Other networks,50MB Data + 20 SMS to all MTN numbers. Press 1 to confirm 2 to cancel.",
                            "validityDays": 1,
                            "type": "Combo",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.50,
                                "LRD": 91.54
                            }
                        },
                        {
                            "productName": "100LD-36mins-48hrs",
                            "cost": 0.55,
                            "productId": 244,
                            "categoryId": 229,
                            "categoryName": "Voice Bundle",
                            "description": "Get 26 mins to call MTN numbers,10 mins to call all networks, 100sms onnet to MTN numbers and 20MB data, valid for 48hrs.",
                            "validityDays": 2,
                            "type": "Voice",
                            "validityHours": 48,
                            "costCurrency": {
                                "USD": 0.55,
                                "LRD": 100
                            }
                        },
                        {
                            "productName": "$0.20-120MB-3days-Whatsapp",
                            "cost": 0.20,
                            "productId": 1349,
                            "categoryId": 249,
                            "categoryName": "Whatsapp Only",
                            "description": "You have selected $0.20 120MB Whatsapp Package valid 3 days.",
                            "validityDays": 3,
                            "type": "Data",
                            "validityHours": 72,
                            "costCurrency": {
                                "USD": 0.20,
                                "LRD": 36.62
                            }
                        },
                        {
                            "productName": "$50 - 60GB",
                            "cost": 50,
                            "productId": 40,
                            "categoryId": 8,
                            "categoryName": "Monthly",
                            "description": "You have selected $50 - 60GB Package valid 30 days.",
                            "validityDays": 30,
                            "type": "Data",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 50,
                                "LRD": 9154.18
                            }
                        },
                        {
                            "productName": "$0.50 - 400MB - 1Day",
                            "cost": 0.5,
                            "productId": 17,
                            "categoryId": 158,
                            "categoryName": "Daily",
                            "description": "You have selected $0.50 - 400MB Package valid 24hrs.",
                            "validityDays": 1,
                            "type": "Data",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.5,
                                "LRD": 91.54
                            }
                        },
                        {
                            "productName": "$0.50-350MB-7days-Whatsapp",
                            "cost": 0.50,
                            "productId": 1351,
                            "categoryId": 249,
                            "categoryName": "Whatsapp Only",
                            "description": "You have selected $0.50 350MB Whatsapp Package valid 7 days.",
                            "validityDays": 7,
                            "type": "Data",
                            "validityHours": 168,
                            "costCurrency": {
                                "USD": 0.50,
                                "LRD": 91.54
                            }
                        },
                        {
                            "productName": "$5 - 3.3GB",
                            "cost": 5,
                            "productId": 34,
                            "categoryId": 8,
                            "categoryName": "Monthly",
                            "description": "You have selected $5 - 3.3GB Package valid 30 days.",
                            "validityDays": 30,
                            "type": "Data",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 5,
                                "LRD": 915.42
                            }
                        },
                        {
                            "productName": "$0.20-120MB-3days-Facebook",
                            "cost": 0.20,
                            "productId": 1436,
                            "categoryId": 289,
                            "categoryName": "Facebook Only",
                            "description": "You have selected $0.20 120MB facebook Package valid 3 days.",
                            "validityDays": 3,
                            "type": "Data",
                            "validityHours": 72,
                            "costCurrency": {
                                "USD": 0.20,
                                "LRD": 36.62
                            }
                        },
                        {
                            "productName": "150LD-53mins-3days",
                            "cost": 0.82,
                            "productId": 13,
                            "categoryId": 229,
                            "categoryName": "Voice Bundle",
                            "description": "Get 38 mins calls to MTN numbers, 15 mins calls to all networks plus 50MB data and 100SMS valid for 3 days.",
                            "validityDays": 3,
                            "type": "Voice",
                            "validityHours": 72,
                            "costCurrency": {
                                "USD": 0.82,
                                "LRD": 150
                            }
                        },
                        {
                            "productName": "$30 - 40GB",
                            "cost": 30,
                            "productId": 39,
                            "categoryId": 8,
                            "categoryName": "Monthly",
                            "description": "You have selected $30 - 40GB Package valid 30 days.",
                            "validityDays": 30,
                            "type": "Data",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 30,
                                "LRD": 5492.51
                            }
                        },
                        {
                            "productName": "40LD-12mins-24hrs",
                            "cost": 0.22,
                            "productId": 1723,
                            "categoryId": 229,
                            "categoryName": "Voice Bundle",
                            "description": "Get 10 mins calls to MTN numbers and 2mins calls to all networks and 30 SMS onnet for 24hrs",
                            "validityDays": 1,
                            "type": "Voice",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.22,
                                "LRD": 40
                            }
                        },
                        {
                            "productName": "$0.05-25MB-1day-Facebook",
                            "cost": 0.05,
                            "productId": 1438,
                            "categoryId": 289,
                            "categoryName": "Facebook Only",
                            "description": "You have selected $0.05 25MB facebook Package valid 1 day.",
                            "validityDays": 1,
                            "type": "Data",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.05,
                                "LRD": 9.15
                            }
                        },
                        {
                            "productName": "$20-Prestige",
                            "cost": 20,
                            "productId": 349,
                            "categoryId": 162,
                            "categoryName": "Prestige bundles(30 days)",
                            "description": "14.5GB,400mins-MTN,200mins-all networks,35mins-Int'l + more",
                            "validityDays": 30,
                            "type": "Combo",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 20,
                                "LRD": 3661.67
                            }
                        },
                        {
                            "productName": "$50-Prestige",
                            "cost": 50,
                            "productId": 350,
                            "categoryId": 162,
                            "categoryName": "Prestige bundles(30 days)",
                            "description": "35GB,700mins-MTN,700mins-all networks,120mins-Int'l + more",
                            "validityDays": 30,
                            "type": "Combo",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 50,
                                "LRD": 9154.18
                            }
                        },
                        {
                            "productName": "10LD-15MB-24hrs",
                            "cost": 0.05,
                            "productId": 367,
                            "categoryId": 228,
                            "categoryName": "Data Bundle",
                            "description": "Get 15MB of data to browse the internet valid for 24hrs.",
                            "validityDays": 1,
                            "type": "Data",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.05,
                                "LRD": 10
                            }
                        },
                        {
                            "productName": "$2 - 1GB",
                            "cost": 2,
                            "productId": 33,
                            "categoryId": 8,
                            "categoryName": "Monthly",
                            "description": "You have selected $2 - 1GB Package valid 30 days.",
                            "validityDays": 30,
                            "type": "Data",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 2,
                                "LRD": 366.17
                            }
                        },
                        {
                            "productName": "$10-12GB-10Days",
                            "cost": 10,
                            "productId": 21,
                            "categoryId": 6,
                            "categoryName": "Weekly",
                            "description": "You have selected $10-12GB Package valid 7 days.",
                            "validityDays": 10,
                            "type": "Data",
                            "validityHours": 240,
                            "costCurrency": {
                                "USD": 10,
                                "LRD": 1830.84
                            }
                        },
                        {
                            "productName": "$1-500MB-3Days",
                            "cost": 1,
                            "productId": 18,
                            "categoryId": 158,
                            "categoryName": "Daily",
                            "description": "You have selected $1-500MB Package valid 3Days.",
                            "validityDays": 3,
                            "type": "Data",
                            "validityHours": 72,
                            "costCurrency": {
                                "USD": 1,
                                "LRD": 183.08
                            }
                        },
                        {
                            "productName": "$20-Prepaid-Offer",
                            "cost": 20,
                            "productId": 1274,
                            "categoryId": 227,
                            "categoryName": "EBU HVC Packages",
                            "description": "Get 450 mins to MTN, 250 mins to other networks, Unlimited onnet sms,250 all-net sms, 35mins int'l(Canada/USA) and 16GB for $20 valid 30 days",
                            "validityDays": 30,
                            "type": "Combo",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 20,
                                "LRD": 3661.67
                            }
                        },
                        {
                            "productName": "$1-1GB-24hrs",
                            "cost": 1,
                            "productId": 1537,
                            "categoryId": 238,
                            "categoryName": "Suprise of the Day",
                            "description": "Are you want to purchase {0} Package Suprise promo?\\\\nSelect",
                            "validityDays": 1,
                            "type": "Data",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 1,
                                "LRD": 183.08
                            }
                        },
                        {
                            "productName": "$20 - 21GB",
                            "cost": 20,
                            "productId": 38,
                            "categoryId": 8,
                            "categoryName": "Monthly",
                            "description": "You have selected $20 - 21GB Package valid 30 days.",
                            "validityDays": 30,
                            "type": "Data",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 20,
                                "LRD": 3661.67
                            }
                        },
                        {
                            "productName": "$10 - 10GB",
                            "cost": 10,
                            "productId": 36,
                            "categoryId": 8,
                            "categoryName": "Monthly",
                            "description": "You have selected $10 - 10GB Package valid 30 days.",
                            "validityDays": 30,
                            "type": "Data",
                            "validityHours": 720,
                            "costCurrency": {
                                "USD": 10,
                                "LRD": 1830.84
                            }
                        },
                        {
                            "productName": "$0.35-100MB-1Hr",
                            "cost": 0,
                            "productId": 1881,
                            "categoryId": 158,
                            "categoryName": "Daily",
                            "description": "You have selected $0.35-100MB Package valid 24hrs.",
                            "validityDays": 0,
                            "type": "Data",
                            "validityHours": 0,
                            "costCurrency": {
                                "USD": 0,
                                "LRD": 0.00
                            }
                        },
                        {
                            "productName": "$0.10-5mins-4sms-24hrs",
                            "cost": 0.10,
                            "productId": 1471,
                            "categoryId": 288,
                            "categoryName": "DYOFallback",
                            "description": "You have less than $1.00, activate 0.10cent offer to get 5mins (On-net), 4sms valid 24HRS. Please enter 1 to confirm and 2 to cancel",
                            "validityDays": 1,
                            "type": "Combo",
                            "validityHours": 24,
                            "costCurrency": {
                                "USD": 0.10,
                                "LRD": 18.31
                            }
                        }
                    ],
                    "success": true,
                    "message": "",
                    "statusCode": 0,
                    "transactionId": null
                }
                """;
        return ResponseEntity.ok().body(successResponse);
    }
}