package com.task.mockserver.dclm;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DCLMController {

    @PostMapping(value = "/customerInteractionService/v1/productUserUpdateRequest", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateProductInformation(@RequestBody Object body) {
        String response = """
                {
                    "id": "PI349466",
                    "href": "https://hostname/partyInteractionManagement/v1/partyInteraction/PI349466",
                    "customFields": {},
                    "interactionDate": {
                        "startDateTime": "2024-01-15T16:00:04.736Z",
                        "endDateTime": "2024-01-15T16:00:05.231Z"
                    },
                    "reason": "01,02,03",
                    "status": "completed",
                    "direction": "inbound",
                    "relatedParty": [
                        {
                            "role": "Customer",
                            "id": "C9008",
                            "@referredType": "Customer",
                            "@schemaLocation": "",
                            "href": "",
                            "name": "syed farman",
                            "engagedParty": {
                                "id": "I22707",
                                "@referredType": "Individual",
                                "@schemaLocation": "",
                                "href": ""
                            }
                        },
                        {
                            "role": "dclmbulk",
                            "validFor": [
                                {
                                    "startDateTime": "2024-01-15T16:00:04.762Z",
                                    "endDateTime": "2024-01-15T16:00:04.762Z"
                                }
                            ],
                            "id": "Balraj",
                            "@referredType": "SSOUser",
                            "@schemaLocation": "",
                            "href": "",
                            "name": "Balraj",
                            "contactMedium": [
                                {
                                    "medium": {
                                        "type": "Mobile",
                                        "verified": false,
                                        "number": "987654333"
                                    },
                                    "type": "Phone",
                                    "preferred": false
                                },
                                {
                                    "medium": {
                                        "type": "EmailAddress",
                                        "verified": false,
                                        "emailAddress": "Balraj@gmail.com"
                                    },
                                    "type": "EmailAddress",
                                    "preferred": false
                                }
                            ]
                        }
                    ],
                    "interactionItem": [
                        {
                            "id": "II1",
                            "item": {
                                "id": "RO15433",
                                "href": "",
                                "name": "farman",
                                "@baseType": "PartyRole",
                                "@type": "PartyRole",
                                "@schemaLocation": "",
                                "createdDate": "2024-01-15T16:00:04.926Z",
                                "relatedEntity": {
                                    "publicIdentifier": "764146826",
                                    "id": "PR40390",
                                    "@referredType": "Product"
                                },
                                "roleType": "ProductUser",
                                "engagedParty": {
                                    "id": "I23121",
                                    "contactMedium": [
                                        {
                                            "medium": {
                                                "type": "mobile",
                                                "verified": false,
                                                "number": "909090909"
                                            },
                                            "type": "Phone",
                                            "preferred": false
                                        }
                                    ],
                                    "fullName": "farman",
                                    "status": "initialized",
                                    "createdDate": "2024-01-15T16:00:04.922Z",
                                    "@baseType": "Party",
                                    "@type": "Individual"
                                },
                                "status": "initialized"
                            }
                        }
                    ],
                    "channel": [
                        {
                            "name": "dclmBulk",
                            "id": "dclmbulk",
                            "@referredType": "Channel",
                            "@type": "dclmBulk",
                            "@schemaLocation": "",
                            "href": ""
                        }
                    ],
                    "customerId": [
                        "C9008"
                    ],
                    "accountId": [
                        "300000151"
                    ],
                    "productId": [
                        "PR40390"
                    ],
                    "publicIdentifier": [
                        "764146826"
                    ],
                    "privateIdentifier": [
                        "PR40390"
                    ],
                    "createdDate": "2024-01-15T16:00:04.738Z",
                    "modifiedDate": "2024-01-15T16:00:05.231Z",
                    "_internal": {},
                    "@baseType": "PartyInteraction",
                    "@type": "ProductUserUpdateRequest",
                    "@schemaLocation": "https://hostname/partyInteractionManagement/v1/partyInteraction/schema",
                    "retryable": false,
                    "retryableCount": 0
                }
                """;
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(value = "/productInventoryManagement/v1/product/QRcode", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getQRCodeWithMSISDN(@RequestParam String publicIdentifier) {
        String response = "iVBORw0KGgoAAAANSUhEUgAAAMgAAAEsAQAAAACugcETAAABw0lEQVR4Xu2W0WotIQxFBX8rkF8P+FsBu1fm3p62tG+m9MGcweNkCUazjTP2Tza+Ot7tkkuwSy7BLrkEu+R3SYwxY670vWLY5LWFLD0xUy5fWHk6iKZf4WkzFYrz2kbCXExBWC/ZO9Wox6guomfl3GGz+h929ChBEpWyx75o5xzB0v8nz/95zpPwmNrQcPU0JO0V21FCzgBhZqwyKojzRDLkVFXuTF0boPNEu6kI+Ef3ciOQBiKfDhRqVLurXrSQVecWjdTJgrWQJ22DmdVK/ZW68wTxWZW9HBJlIswOwvp8EYRSuKnphNVAciISMme1oySwgXBPlM4pFp8yd5jImZwok1DUViFvICU/5I7iVxJJC1lM6wgjqEhaeA8JddGgygSZI44ewhpVy9lX6t9TYs8ToBMCF60W+6TuPOE211OKH6bEaUgHYU/lwWVljq+BPKUuVfX0Hx9r4lESdYIHZUKK562HYBRWXRpV/Ph1kOA48Q1ERdp8dDH2PFFH6tBauTGY/6Wds6SSlV6Dakf7SCk+UDwna/cRY6UoHuU3kc3szhcrKtn0OwgKkYdAqiK9dvQs+d4uuQS75BLskkuwS/4CeQMzoA41dIELgwAAAABJRU5ErkJggg==";
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/customerInteractionService/v1/simChangeRequest", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> actualSimSwap(@RequestBody String body, @RequestHeader(name = "Authorization") String authorization) {

        System.out.println(body);
        System.out.println(authorization);

        String successResponse = """
                {
                    "id": "PI285835",
                    "href": "https://dclm-mmp.cluster1.devtestlab2.tecnotree.com/partyInteractionManagement/v1/partyInteraction/PI285835",
                    "interactionDate": {
                        "startDateTime": "2021-05-26T11:25:39.711Z"
                    },
                    "description": "",
                    "reason": "01",
                    "status": "captured",
                    "direction": "inbound",
                    "relatedParty": [
                        {
                            "role": "CSRAgent",
                            "id": "dclmappuser1",
                            "@referredType": "SSOUser",
                            "@schemaLocation": "",
                            "href": "",
                            "name": "dclmappuser1",
                            "contactMedium": [
                                {
                                    "medium": {
                                        "type": "Mobile",
                                        "number": "9945760033"
                                    },
                                    "type": "Phone",
                                    "preferred": false
                                },
                                {
                                    "medium": {
                                        "type": "EmailAddress",
                                        "emailAddress": "subrat@tecnotree.com"
                                    },
                                    "type": "EmailAddress",
                                    "preferred": false
                                }
                            ],
                            "location": "Bangalore"
                        }
                    ],
                    "interactionItem": [
                        {
                            "id": "II1",
                            "item": {
                                "href": "",
                                "path": "",
                                "@type": "ProductOrder",
                                "@schemaLocation": "",
                                "orderItem": [
                                    {
                                        "href": "",
                                        "customFields": {
                                            "simChangeType": "simUpgrade",
                                            "ecwProfile": "xyz",
                                            "ecwStatus": "active"
                                        },
                                        "action": "modify",
                                        "actionSubType": "changeSIM",
                                        "transferDeposit": false,
                                        "product": {
                                            "id": "PR487428",
                                            "href": "",
                                            "externalSystem": [
                                                {
                                                    "id": "41201ad8-4065-4fc1-b76f-377770470900",
                                                    "system": "NGB",
                                                    "@type": "OfferingInstance",
                                                    "@baseType": "OfferingInstance"
                                                },
                                                {
                                                    "id": "cdb4876d-8c19-497b-ab6a-f68afe2a20bf",
                                                    "system": "NGB",
                                                    "@type": "ServiceAccount",
                                                    "@baseType": "ServiceAccount"
                                                },
                                                {
                                                    "id": "7756egdmyv",
                                                    "system": "DAAS",
                                                    "@type": "DAAS",
                                                    "@baseType": "DAAS"
                                                },
                                                {
                                                    "id": "PR487428",
                                                    "system": "DCBS",
                                                    "@type": "ServiceAccount",
                                                    "@baseType": "ServiceAccount"
                                                }
                                            ],
                                            "publicIdentifier": "9966903104",
                                            "productSpecification": {
                                                "technology": [
                                                    "GSM"
                                                ],
                                                "id": "6076ab7f3da6b60006926ef5",
                                                "@referredType": "ProductSpecification",
                                                "@baseType": "ProductSpecification",
                                                "@type": "CompositeProductSpecification",
                                                "@schemaLocation": "",
                                                "href": "",
                                                "name": "My GSM for Prepaid",
                                                "version": "14",
                                                "LoB": "Mobile"
                                            },
                                            "productOffering": {
                                                "id": "6076ab813da6b60006926efc",
                                                "href": "",
                                                "externalSystem": [
                                                    {
                                                        "id": "ecf311fd-d555-4a72-9273-17d344735670",
                                                        "system": "NGB",
                                                        "@type": "MandatoryOffering",
                                                        "@baseType": "Offering"
                                                    }
                                                ],
                                                "name": "My GSM for Prepaid",
                                                "category": [
                                                    {
                                                        "name": "Plan",
                                                        "version": "1",
                                                        "id": "5ce67563a9060a9e0944ad57",
                                                        "@referredType": "Category",
                                                        "@type": "Category",
                                                        "@schemaLocation": "",
                                                        "href": ""
                                                    },
                                                    {
                                                        "name": "SharedData",
                                                        "version": "1",
                                                        "id": "6012700cfc0e4f91c3a3e71d",
                                                        "@referredType": "Category",
                                                        "@type": "Category",
                                                        "@schemaLocation": "",
                                                        "href": ""
                                                    }
                                                ],
                                                "path": "",
                                                "@type": "SimpleProductOffering",
                                                "@schemaLocation": ""
                                            },
                                            "relatedParty": [
                                                {
                                                    "role": "Customer",
                                                    "id": "C5022932",
                                                    "@referredType": "Customer",
                                                    "@schemaLocation": "",
                                                    "href": "",
                                                    "engagedParty": {
                                                        "id": "I137761",
                                                        "@referredType": "Individual",
                                                        "@schemaLocation": "",
                                                        "href": ""
                                                    }
                                                }
                                            ],
                                            "productRelationship": [
                                                {
                                                    "product": {
                                                        "id": "PR487429",
                                                        "@referredType": "Product",
                                                        "@schemaLocation": "",
                                                        "href": ""
                                                    },
                                                    "type": "bundled",
                                                    "relationshipType": "bundled"
                                                },
                                                {
                                                    "product": {
                                                        "id": "PR487430",
                                                        "@referredType": "Product",
                                                        "@schemaLocation": "",
                                                        "href": ""
                                                    },
                                                    "type": "bundled",
                                                    "relationshipType": "bundled"
                                                },
                                                {
                                                    "product": {
                                                        "id": "PR487431",
                                                        "@referredType": "Product",
                                                        "@schemaLocation": "",
                                                        "href": ""
                                                    },
                                                    "type": "bundled",
                                                    "relationshipType": "bundled"
                                                },
                                                {
                                                    "product": {
                                                        "id": "PR487432",
                                                        "@referredType": "Product",
                                                        "@schemaLocation": "",
                                                        "href": ""
                                                    },
                                                    "type": "bundled",
                                                    "relationshipType": "bundled"
                                                },
                                                {
                                                    "product": {
                                                        "id": "PR487433",
                                                        "@referredType": "Product",
                                                        "@schemaLocation": "",
                                                        "href": ""
                                                    },
                                                    "type": "bundled",
                                                    "relationshipType": "bundled"
                                                }
                                            ],
                                            "path": "",
                                            "@schemaLocation": ""
                                        },
                                        "orderItem": [
                                            {
                                                "href": "",
                                                "transferDeposit": false,
                                                "product": {
                                                    "href": "",
                                                    "realizingResource": [
                                                        {
                                                            "id": "604f4164e19570c77203787d",
                                                            "@referredType": "SIM",
                                                            "@baseType": "PhysicalResource",
                                                            "@schemaLocation": "",
                                                            "href": ""
                                                        }
                                                    ],
                                                    "characteristic": [
                                                        {
                                                            "name": "SIMNumber",
                                                            "value": "662900991000635",
                                                            "@type": "SIM"
                                                        }
                                                    ],
                                                    "path": "",
                                                    "@schemaLocation": ""
                                                },
                                                "reservationId": "60ae3011cdf6c44f156a743a",
                                                "modifiable": true,
                                                "path": "",
                                                "@schemaLocation": ""
                                            }
                                        ],
                                        "modifiable": true,
                                        "path": "",
                                        "@schemaLocation": ""
                                    }
                                ],
                                "channel": [
                                    {
                                        "name": "ISL",
                                        "role": "interaction creation",
                                        "id": "isl",
                                        "@referredType": "Channel",
                                        "@type": "ISL",
                                        "@schemaLocation": "",
                                        "href": ""
                                    }
                                ],
                                "relatedParty": [
                                    {
                                        "role": "CSRAgent",
                                        "id": "dclmappuser1",
                                        "@referredType": "SSOUser",
                                        "@schemaLocation": "",
                                        "href": "",
                                        "name": "dclmappuser1",
                                        "contactMedium": [
                                            {
                                                "medium": {
                                                    "type": "Mobile",
                                                    "number": "9945760033"
                                                },
                                                "type": "Phone",
                                                "preferred": false
                                            },
                                            {
                                                "medium": {
                                                    "type": "EmailAddress",
                                                    "emailAddress": "subrat@tecnotree.com"
                                                },
                                                "type": "EmailAddress",
                                                "preferred": false
                                            }
                                        ],
                                        "location": "Bangalore"
                                    }
                                ],
                                "modifiable": true,
                                "cancellable": true
                            },
                            "status": "pendingApproval",
                            "statusChangeDate": "2021-05-26T11:25:40.703Z"
                        }
                    ],
                    "channel": [
                        {
                            "name": "ISL",
                            "role": "interaction creation",
                            "id": "isl",
                            "@referredType": "Channel",
                            "@type": "ISL",
                            "@schemaLocation": "",
                            "href": ""
                        }
                    ],
                    "productId": [
                        "PR487428"
                    ],
                    "publicIdentifier": [
                        "9966903104"
                    ],
                    "createdDate": "2021-05-26T11:25:39.715Z",
                    "modifiedDate": "2021-05-26T11:25:41.089Z",
                    "path": "https://dclm-mmp.cluster1.devtestlab2.tecnotree.com/partyInteractionManagement/v1/partyInteraction",
                    "@baseType": "PartyInteraction",
                    "@type": "SimChangeRequest",
                    "@schemaLocation": "https://dclm-mmp.cluster1.devtestlab2.tecnotree.com/partyInteractionManagement/v1/partyInteraction/schema",
                    "retryable": false
                }
                """;

        String badRequestResponse = """
                {
                    "code": "CIS-1727",
                    "reason": "Bad Request",
                    "message": "There is no active or suspended or softSuspended Product with publicIdentifier 260769073810",
                    "timestamp": "2026-08-11T15:02:43.584Z",
                    "relatedError": [],
                    "createdDate": "2026-08-11T15:02:43.584Z"
                }
                """;
        return ResponseEntity.ok().body(successResponse);
    }
}