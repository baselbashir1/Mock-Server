package com.task.mockserver.cbp;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tmf-api/productManagement/v4")
public class CBPController {

    @GetMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSubscriptionDetails(
            @RequestParam(value = "realizingResource.id", required = false) String realizingResourceId,
            @RequestParam(value = "productOffering.id", required = false) String productOfferingId,
            @RequestHeader(value = "correlationId", required = false) String correlationId) {
        String successResponse = """
                [
                    {
                        "id": "0094579689186968162693432801636549265864",
                        "status": "active",
                        "startDate": "2024-08-14T06:54:58",
                        "terminationDate": "2024-12-14T06:54:58",
                        "productOffering": {
                            "id": " USEmb_Post_Hybrid_USG_500 "
                        },
                        "productPrice": [
                            {
                                "priceType": "ONETIME",
                                "price": {
                                    "dutyFreeAmount": {
                                        "unit": "K",
                                        "value": "451.0"
                                    }
                                }
                            }
                        ],
                        "productCharacteristic": [
                            {
                                "name": "paymentMode",
                                "value": "MoMO"
                            }
                        ],
                        "realizingResource": [
                            {
                                "id": "9371987370",
                                "type": "resourceNumber"
                            }
                        ]
                    }
                ]
                """;

        String failureResponse = """
                {
                    "code": "2002",
                    "message": "Application Internal Error",
                    "status": "Fail"
                }
                """;
        return ResponseEntity.status(HttpStatus.OK).body(successResponse);
    }

    @PostMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> subscribe(@RequestHeader(value = "correlationId", required = false) String correlationId) {
        String successResponse = """
                {
                    "id": "00315373991483613184",
                    "status": "created",
                    "productCharacteristic": [
                        {
                            "name": "modeOfPayment",
                            "value": "MainBalance"
                        },
                        {
                            "name": "channel",
                            "value": "COM"
                        },
                        {
                            "name": "costOwner",
                            "value": "347632814938"
                        },
                        {
                            "name": "code",
                            "value": "0"
                        },
                        {
                            "name": "message",
                            "value": "Success"
                        },
                        {
                            "name": "notificationContent",
                            "value": "Yello! You have received K50:150Mins+1.5GB + 50SMS bundle valid till 2026-08-31 11:53:39.0 from 347632814938"
                        }
                    ],
                    "productOffering": {
                        "id": "6625"
                    },
                    "productPrice": [],
                    "realizingResource": [
                        {
                            "type": "resourceNumber",
                            "id": "417324299"
                        }
                    ],
                    "product": []
                }
                """;

        String failureResponse = """
                {
                    "code": "2073",
                    "message": "Not a Valid Package",
                    "status": "Fail"
                }
                """;
        return ResponseEntity.ok(successResponse);
    }
}