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

        String newResponse = """
                {
                    "id": "PI154206",
                    "href": "https://bss-uat.mtnzambia.co.zm/partyInteractionManagement/v1/partyInteraction/PI154206",
                    "customFields": {},
                    "interactionDate": {
                        "startDateTime": "2026-08-11T17:29:43.394Z"
                    },
                    "reason": "01",
                    "status": "draft",
                    "direction": "inbound",
                    "relatedParty": [
                        {
                            "role": "isl",
                            "validFor": [
                                {
                                    "startDateTime": "2026-08-11T17:29:43.344Z",
                                    "endDateTime": "2026-08-11T17:29:43.344Z"
                                }
                            ],
                            "id": "Madapi",
                            "@referredType": "SSOUser",
                            "name": "Madapi",
                            "contactMedium": [
                                {
                                    "medium": {
                                        "type": "EmailAddress",
                                        "verified": false,
                                        "emailAddress": "Madapi@mtn.com"
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
                                "customFields": {},
                                "@type": "ProductOrder",
                                "orderItem": [
                                    {
                                        "id": "OI1",
                                        "transferDeposit": false,
                                        "product": {
                                            "publicIdentifier": "8964502000293416052",
                                            "_internal": {}
                                        },
                                        "orderItem": [
                                            {
                                                "id": "OI2",
                                                "transferDeposit": false,
                                                "product": {
                                                    "characteristic": [
                                                        {
                                                            "name": "SIMNumber",
                                                            "value": "8964502000291343631",
                                                            "@type": "SIM"
                                                        }
                                                    ],
                                                    "_internal": {}
                                                },
                                                "modifiable": true
                                            }
                                        ],
                                        "modifiable": true
                                    }
                                ],
                                "channel": [
                                    {
                                        "name": "ISL",
                                        "role": "interactioncreation",
                                        "id": "isl",
                                        "@referredType": "Channel",
                                        "@type": "ISL"
                                    }
                                ],
                                "relatedParty": [
                                    {
                                        "role": "isl",
                                        "validFor": [
                                            {
                                                "startDateTime": "2026-08-11T17:29:43.344Z",
                                                "endDateTime": "2026-08-11T17:29:43.344Z"
                                            }
                                        ],
                                        "id": "Madapi",
                                        "@referredType": "SSOUser",
                                        "name": "Madapi",
                                        "contactMedium": [
                                            {
                                                "medium": {
                                                    "type": "EmailAddress",
                                                    "verified": false,
                                                    "emailAddress": "Madapi@mtn.com"
                                                },
                                                "type": "EmailAddress",
                                                "preferred": false
                                            }
                                        ]
                                    }
                                ],
                                "modifiable": true,
                                "cancellable": true
                            }
                        }
                    ],
                    "channel": [
                        {
                            "name": "ISL",
                            "role": "interactioncreation",
                            "id": "isl",
                            "@referredType": "Channel",
                            "@type": "ISL"
                        }
                    ],
                    "productId": [],
                    "publicIdentifier": [
                        "8964502000293416052"
                    ],
                    "createdDate": "2026-08-11T17:29:43.408Z",
                    "modifiedDate": "2026-08-11T17:29:44.480Z",
                    "_internal": {},
                    "version": 0,
                    "@baseType": "PartyInteraction",
                    "@type": "SimChangeRequest",
                    "@schemaLocation": "https://bss-uat.mtnzambia.co.zm/partyInteractionManagement/v1/partyInteraction/schema",
                    "retryable": false,
                    "retryableCount": 0
                }
                """;
        return ResponseEntity.ok().body(newResponse);
    }

    @GetMapping(value = "/partyInteractionManagement/v1/partyInteraction", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSimChangeStatus(@RequestParam String publicIdentifier,
                                                @RequestParam String type,
                                                @RequestParam String status,
                                                @RequestParam String offset,
                                                @RequestParam String limit,
                                                @RequestParam String sort) {
        String response = """ 
                [
                    {
                        "id": "PI79628",
                        "href": "https://mtnss-uat.mtn.co.ss/partyInteractionManagement/v1/partyInteraction/PI79628",
                        "interactionDate": {
                            "startDateTime": "2021-10-11T13:42:11.793Z",
                            "endDateTime": "2021-10-11T13:44:04.423Z"
                        },
                        "description": "",
                        "reason": "01",
                        "status": "completed",
                        "subStatus": "draft",
                        "statusChangeDate": "2021-10-11T13:43:57.508Z",
                        "direction": "inbound",
                        "relatedParty": [
                            {
                                "role": "Customer",
                                "id": "C3758",
                                "@referredType": "Customer",
                                "@schemaLocation": "",
                                "href": "",
                                "name": "TSSDER AZSXDC",
                                "engagedParty": {
                                    "id": "I14071",
                                    "@referredType": "Individual",
                                    "@schemaLocation": "",
                                    "href": ""
                                }
                            },
                            {
                                "role": "CSRAgent",
                                "id": "harsha",
                                "@referredType": "SSOUser",
                                "@schemaLocation": "",
                                "href": "",
                                "name": "harsha",
                                "contactMedium": [
                                    {
                                        "medium": {
                                            "type": "EmailAddress",
                                            "emailAddress": "harshavardhan.raju@tecnotree.com"
                                        },
                                        "type": "EmailAddress",
                                        "role": "null",
                                        "id": "null",
                                        "name": "null",
                                        "preferred": false
                                    }
                                ]
                            }
                        ],
                        "interactionItem": [
                            {
                                "id": "IIgy1",
                                "itemDate": "2021-10-11T13:42:11.494Z",
                                "item": {
                                    "id": "PO65809",
                                    "href": "",
                                    "customFields": {
                                        "productOrderGroup": [
                                            "PO65809"
                                        ]
                                    },
                                    "externalSystem": [
                                        {
                                            "id": "4503599629442853",
                                            "system": "workflow"
                                        },
                                        {
                                            "id": "f41b8796-aeb0-49b2-9175-cc897b3e9da2",
                                            "system": "DOM"
                                        }
                                    ],
                                    "@baseType": "ProductOrder",
                                    "@type": "ProductOrder",
                                    "@schemaLocation": "",
                                    "relatedParty": [
                                        {
                                            "role": "Customer",
                                            "id": "C3758",
                                            "@referredType": "Customer",
                                            "name": "TSSDER AZSXDC",
                                            "engagedParty": {
                                                "id": "I14071",
                                                "@referredType": "Individual"
                                            }
                                        },
                                        {
                                            "role": "CSRAgent",
                                            "id": "harsha",
                                            "@referredType": "SSOUser",
                                            "name": "harsha",
                                            "contactMedium": [
                                                {
                                                    "medium": {
                                                        "type": "EmailAddress",
                                                        "emailAddress": "harshavardhan.raju@tecnotree.com"
                                                    },
                                                    "type": "EmailAddress",
                                                    "role": "null",
                                                    "id": "null",
                                                    "name": "null",
                                                    "preferred": false
                                                }
                                            ]
                                        }
                                    ],
                                    "orderItem": [
                                        {
                                            "id": "OI1",
                                            "action": "modify",
                                            "actionSubType": "changeSIM",
                                            "transferDeposit": false,
                                            "productOffering": {
                                                "id": "60f90f1fcc5ee800069dbbb0",
                                                "name": "GPR_P-DATA PKG-100MB INTU-IT",
                                                "businessType": [
                                                    "Postpaid"
                                                ]
                                            },
                                            "product": {
                                                "id": "PR21810",
                                                "customFields": {
                                                    "registrationType": "White SIM",
                                                    "moMoFlag": false
                                                },
                                                "externalSystem": [
                                                    {
                                                        "id": "901c64ed-cebe-42c0-aca6-4fbf956e2195",
                                                        "system": "NGB",
                                                        "@type": "OfferingInstance",
                                                        "@baseType": "OfferingInstance"
                                                    },
                                                    {
                                                        "id": "59d9c5c9-52b4-4a49-834d-ceab2e8fafaa",
                                                        "system": "NGB",
                                                        "@type": "ServiceAccount",
                                                        "@baseType": "ServiceAccount"
                                                    }
                                                ],
                                                "name": "GPR_P-DATA PKG-100MB INTU-IT",
                                                "startDate": "2021-10-08T11:05:06.789Z",
                                                "status": "active",
                                                "createdDate": "2021-10-08T11:05:06.790Z",
                                                "modifiedDate": "2021-10-11T12:30:34.466Z",
                                                "businessType": "Postpaid",
                                                "technology": "DataSIM",
                                                "publicIdentifier": "593003498",
                                                "productSpecification": {
                                                    "id": "60f90f1ecc5ee800069dbba9",
                                                    "name": "GPR_P-DATA PKG-100MB INTU-IT",
                                                    "version": "51",
                                                    "technology": [
                                                        "DataSIM"
                                                    ],
                                                    "@baseType": "ProductSpecification",
                                                    "@type": "CompositeProductSpecification"
                                                },
                                                "productOffering": {
                                                    "id": "60f90f1fcc5ee800069dbbb0",
                                                    "customFields": {
                                                        "expiryDate": "2099-07-22T06:38:08.822Z"
                                                    },
                                                    "externalSystem": [
                                                        {
                                                            "id": "dd3391ec-e1d5-4b2e-ae04-cb6b45904830",
                                                            "system": "NGB",
                                                            "@type": "MandatoryOffering",
                                                            "@baseType": "Offering"
                                                        },
                                                        {
                                                            "id": "1317",
                                                            "system": "EricssonCharging",
                                                            "autoRenew": "Yes",
                                                            "@type": "BPLAN",
                                                            "@baseType": "Offering",
                                                            "prodSpecCharValueUse": [
                                                                {
                                                                    "name": "Data Limit",
                                                                    "@type": "Characteristic",
                                                                    "valueType": "string",
                                                                    "productSpecCharacteristicValue": [
                                                                        {
                                                                            "isDefault": true,
                                                                            "unitOfMeasure": "GB",
                                                                            "value": "100",
                                                                            "valueType": "string",
                                                                            "@type": "CharacteristicValue"
                                                                        }
                                                                    ]
                                                                }
                                                            ],
                                                            "recurringChargePeriodType": "Monthly"
                                                        },
                                                        {
                                                            "id": "89",
                                                            "system": "EricssonCharging",
                                                            "autoRenew": "Yes",
                                                            "@type": "PAMID",
                                                            "@baseType": "Offering",
                                                            "prodSpecCharValueUse": [
                                                                {
                                                                    "name": "Data Limit",
                                                                    "@type": "Characteristic",
                                                                    "valueType": "string",
                                                                    "productSpecCharacteristicValue": [
                                                                        {
                                                                            "isDefault": true,
                                                                            "unitOfMeasure": "GB",
                                                                            "value": "100",
                                                                            "valueType": "string",
                                                                            "@type": "CharacteristicValue"
                                                                        }
                                                                    ]
                                                                }
                                                            ],
                                                            "recurringChargePeriodType": "Monthly"
                                                        },
                                                        {
                                                            "id": "ASSD17",
                                                            "system": "EricssonCharging",
                                                            "autoRenew": "Yes",
                                                            "@type": "SDP",
                                                            "@baseType": "Offering",
                                                            "prodSpecCharValueUse": [
                                                                {
                                                                    "name": "Data Limit",
                                                                    "@type": "Characteristic",
                                                                    "valueType": "string",
                                                                    "productSpecCharacteristicValue": [
                                                                        {
                                                                            "isDefault": true,
                                                                            "unitOfMeasure": "GB",
                                                                            "value": "100",
                                                                            "valueType": "string",
                                                                            "@type": "CharacteristicValue"
                                                                        }
                                                                    ]
                                                                }
                                                            ],
                                                            "recurringChargePeriodType": "Monthly"
                                                        },
                                                        {
                                                            "id": "345",
                                                            "system": "EricssonCharging",
                                                            "autoRenew": "Yes",
                                                            "@type": "PAMCSOFFERID",
                                                            "@baseType": "Offering",
                                                            "prodSpecCharValueUse": [
                                                                {
                                                                    "name": "Data Limit",
                                                                    "@type": "Characteristic",
                                                                    "valueType": "string",
                                                                    "productSpecCharacteristicValue": [
                                                                        {
                                                                            "isDefault": true,
                                                                            "unitOfMeasure": "GB",
                                                                            "value": "100",
                                                                            "valueType": "string",
                                                                            "@type": "CharacteristicValue"
                                                                        }
                                                                    ]
                                                                }
                                                            ],
                                                            "recurringChargePeriodType": "Monthly"
                                                        },
                                                        {
                                                            "id": "21,22,23",
                                                            "system": "EricssonCharging",
                                                            "autoRenew": "Yes",
                                                            "@type": "APNID",
                                                            "@baseType": "Offering",
                                                            "prodSpecCharValueUse": [
                                                                {
                                                                    "name": "Data Limit",
                                                                    "@type": "Characteristic",
                                                                    "valueType": "string",
                                                                    "productSpecCharacteristicValue": [
                                                                        {
                                                                            "isDefault": true,
                                                                            "unitOfMeasure": "GB",
                                                                            "value": "100",
                                                                            "valueType": "string",
                                                                            "@type": "CharacteristicValue"
                                                                        }
                                                                    ]
                                                                }
                                                            ],
                                                            "recurringChargePeriodType": "Monthly"
                                                        }
                                                    ],
                                                    "name": "GPR_P-DATA PKG-100MB INTU-IT",
                                                    "category": [
                                                        {
                                                            "name": "Plan",
                                                            "version": "0",
                                                            "id": "5ce67563a9060a9e0944ad57",
                                                            "@referredType": "Category"
                                                        }
                                                    ],
                                                    "@type": "SimpleProductOffering"
                                                },
                                                "productOrder": [
                                                    {
                                                        "orderItemId": "IIfw4",
                                                        "orderItemAction": "add",
                                                        "id": "PO65756",
                                                        "@referredType": "ProductOrder"
                                                    },
                                                    {
                                                        "orderItemId": "OI1",
                                                        "orderItemAction": "modify",
                                                        "orderItemActionSubType": "softSuspension",
                                                        "id": "PO65757",
                                                        "@referredType": "ProductOrder"
                                                    }
                                                ],
                                                "channel": [
                                                    {
                                                        "name": "DCLM",
                                                        "role": "created",
                                                        "id": "dclm",
                                                        "@referredType": "Channel"
                                                    }
                                                ],
                                                "relatedParty": [
                                                    {
                                                        "role": "Customer",
                                                        "id": "C3758",
                                                        "@referredType": "Customer",
                                                        "engagedParty": {
                                                            "id": "I14071",
                                                            "@referredType": "Individual"
                                                        }
                                                    }
                                                ],
                                                "productRelationship": [
                                                    {
                                                        "product": {
                                                            "id": "PR21811",
                                                            "@referredType": "Product"
                                                        },
                                                        "type": "bundled",
                                                        "relationshipType": "bundled"
                                                    },
                                                    {
                                                        "product": {
                                                            "id": "PR21813",
                                                            "@referredType": "Product"
                                                        },
                                                        "type": "bundled",
                                                        "relationshipType": "bundled"
                                                    }
                                                ],
                                                "place": [
                                                    {
                                                        "role": "InstallationAddress",
                                                        "city": "Bagbiapi",
                                                        "stateOrProvince": "SV",
                                                        "country": "GH",
                                                        "addressLine1": "AZSXC",
                                                        "@type": "GeographicAddress"
                                                    }
                                                ],
                                                "billingAccount": {
                                                    "id": "3678",
                                                    "@referredType": "BillingAccount"
                                                },
                                                "productPrice": [
                                                    {
                                                        "name": "Rentals",
                                                        "priceType": "Rental",
                                                        "recurringChargePeriod": "Monthly",
                                                        "price": {
                                                            "taxIncludedAmount": {
                                                                "value": "4.1",
                                                                "unit": "GHS"
                                                            },
                                                            "dutyFreeAmount": {
                                                                "value": "3.28",
                                                                "unit": "GHS"
                                                            },
                                                            "taxRate": 23.5,
                                                            "tax": [
                                                                {
                                                                    "taxCategory": "CST",
                                                                    "taxRate": 5.0,
                                                                    "taxAmount": {
                                                                        "value": 0.16,
                                                                        "unit": "GHS"
                                                                    }
                                                                },
                                                                {
                                                                    "taxCategory": "NHIL",
                                                                    "taxRate": 2.5,
                                                                    "taxAmount": {
                                                                        "value": 0.08,
                                                                        "unit": "GHS"
                                                                    }
                                                                },
                                                                {
                                                                    "taxCategory": "GETFL",
                                                                    "taxRate": 2.5,
                                                                    "taxAmount": {
                                                                        "value": 0.08,
                                                                        "unit": "GHS"
                                                                    }
                                                                },
                                                                {
                                                                    "taxCategory": "COVID-19 Levy",
                                                                    "taxRate": 1.0,
                                                                    "taxAmount": {
                                                                        "value": 0.03,
                                                                        "unit": "GHS"
                                                                    }
                                                                },
                                                                {
                                                                    "taxCategory": "VAT",
                                                                    "taxRate": 12.5,
                                                                    "taxAmount": {
                                                                        "value": 0.4551,
                                                                        "unit": "GHS"
                                                                    }
                                                                }
                                                            ]
                                                        },
                                                        "productOfferingPrice": [
                                                            {
                                                                "id": "60f90f1ecc5ee800069dbbaf",
                                                                "name": "Rentals"
                                                            }
                                                        ]
                                                    }
                                                ],
                                                "productTerm": [
                                                    {
                                                        "description": "deafult term",
                                                        "status": "inactive",
                                                        "validFor": {
                                                            "startDateTime": "2021-10-08T11:05:13.306Z",
                                                            "endDateTime": "2099-12-31T23:59:59.999Z"
                                                        },
                                                        "@type": "ProductTerm"
                                                    },
                                                    {
                                                        "description": "deafult term",
                                                        "status": "inactive",
                                                        "validFor": {
                                                            "startDateTime": "2021-10-08T11:09:03.736Z",
                                                            "endDateTime": "2099-12-31T23:59:59.999Z"
                                                        },
                                                        "@type": "ProductTerm"
                                                    }
                                                ],
                                                "creditLimit": [
                                                    {
                                                        "creditLimitId": "CL1",
                                                        "product": {
                                                            "@referredType": "Product"
                                                        },
                                                        "creditLimitType": "permanent",
                                                        "minCreditLimit": {
                                                            "value": "200",
                                                            "unit": "GHS",
                                                            "dutyFreeValue": "158.73"
                                                        },
                                                        "allottedCreditLimit": {
                                                            "value": "200",
                                                            "unit": "GHS",
                                                            "dutyFreeValue": "158.73"
                                                        }
                                                    }
                                                ],
                                                "activationDate": "2021-10-08T11:05:13.240Z",
                                                "imsiNumber": "620010401346894",
                                                "simNumber": "8923301004013468940",
                                                "@baseType": "Product",
                                                "@type": "Product",
                                                "isCustomerVisible": true,
                                                "LoB": "Mobile",
                                                "xDir": "1"
                                            },
                                            "state": "completed",
                                            "itemTotalPrice": [
                                                {
                                                    "price": {
                                                        "taxIncludedAmount": {
                                                            "value": "0",
                                                            "unit": "GHS"
                                                        },
                                                        "dutyFreeAmount": {
                                                            "value": "0",
                                                            "unit": "GHS"
                                                        },
                                                        "taxRate": 0.0
                                                    }
                                                },
                                                {
                                                    "price": {
                                                        "taxIncludedAmount": {
                                                            "value": "0",
                                                            "unit": "GHS"
                                                        },
                                                        "dutyFreeAmount": {
                                                            "value": "0",
                                                            "unit": "GHS"
                                                        },
                                                        "taxRate": 0.0
                                                    }
                                                }
                                            ],
                                            "orderItem": [
                                                {
                                                    "id": "OI2",
                                                    "action": "add",
                                                    "actionSubType": "changeSIM",
                                                    "transferDeposit": false,
                                                    "product": {
                                                        "id": "PR21896",
                                                        "startDate": "2021-10-11T13:44:00.036Z",
                                                        "status": "created",
                                                        "createdDate": "2021-10-11T13:44:00.037Z",
                                                        "productSpecification": {
                                                            "id": "611258e0efd723000617c750",
                                                            "name": "GSM-SIM NUMBER",
                                                            "version": "131",
                                                            "technology": [
                                                                "GSM",
                                                                "VehicleTracking",
                                                                "DataSIM"
                                                            ],
                                                            "resourcePoolType": "SIM",
                                                            "@baseType": "AtomicProductSpecification",
                                                            "@type": "GoodsProductSpec"
                                                        },
                                                        "productOrder": [
                                                            {
                                                                "orderItemId": "OI2",
                                                                "orderItemAction": "add",
                                                                "orderItemActionSubType": "changeSIM",
                                                                "id": "PO65809",
                                                                "@referredType": "ProductOrder"
                                                            }
                                                        ],
                                                        "relatedParty": [
                                                            {
                                                                "role": "Customer",
                                                                "id": "C3758",
                                                                "@referredType": "Customer",
                                                                "engagedParty": {
                                                                    "id": "I14071",
                                                                    "@referredType": "Individual"
                                                                }
                                                            }
                                                        ],
                                                        "realizingResource": [
                                                            {
                                                                "id": "60e68921be91449294d12491",
                                                                "@referredType": "SIM",
                                                                "@baseType": "PhysicalResource"
                                                            }
                                                        ],
                                                        "characteristic": [
                                                            {
                                                                "name": "SIMNumber",
                                                                "value": "8923301004013468940",
                                                                "@type": "SIM"
                                                            }
                                                        ],
                                                        "productPrice": [
                                                            {
                                                                "price": {
                                                                    "taxIncludedAmount": {
                                                                        "value": "0",
                                                                        "unit": "GHS"
                                                                    },
                                                                    "dutyFreeAmount": {
                                                                        "value": "0",
                                                                        "unit": "GHS"
                                                                    },
                                                                    "taxRate": 0.0
                                                                }
                                                            },
                                                            {
                                                                "price": {
                                                                    "taxIncludedAmount": {
                                                                        "value": "0",
                                                                        "unit": "GHS"
                                                                    },
                                                                    "dutyFreeAmount": {
                                                                        "value": "0",
                                                                        "unit": "GHS"
                                                                    },
                                                                    "taxRate": 0.0
                                                                }
                                                            }
                                                        ],
                                                        "@baseType": "Product",
                                                        "@type": "Product",
                                                        "isCustomerVisible": false
                                                    },
                                                    "itemTotalPrice": [
                                                        {
                                                            "price": {
                                                                "taxIncludedAmount": {
                                                                    "value": "0",
                                                                    "unit": "GHS"
                                                                },
                                                                "dutyFreeAmount": {
                                                                    "value": "0",
                                                                    "unit": "GHS"
                                                                },
                                                                "taxRate": 0.0
                                                            }
                                                        },
                                                        {
                                                            "price": {
                                                                "taxIncludedAmount": {
                                                                    "value": "0",
                                                                    "unit": "GHS"
                                                                },
                                                                "dutyFreeAmount": {
                                                                    "value": "0",
                                                                    "unit": "GHS"
                                                                },
                                                                "taxRate": 0.0
                                                            }
                                                        }
                                                    ],
                                                    "reservationId": "61643f4212dc7b147d9a3c05",
                                                    "modifiable": true
                                                },
                                                {
                                                    "id": "OI3",
                                                    "action": "delete",
                                                    "transferDeposit": false,
                                                    "product": {
                                                        "id": "PR21851",
                                                        "startDate": "2021-10-08T17:50:27.066Z",
                                                        "status": "created",
                                                        "createdDate": "2021-10-08T17:50:27.067Z",
                                                        "modifiedDate": "2021-10-08T17:50:27.621Z",
                                                        "productSpecification": {
                                                            "id": "611258e0efd723000617c750",
                                                            "name": "GSM-SIM NUMBER",
                                                            "version": "125",
                                                            "technology": [
                                                                "GSM",
                                                                "VehicleTracking",
                                                                "DataSIM"
                                                            ],
                                                            "resourcePoolType": "SIM",
                                                            "@baseType": "AtomicProductSpecification",
                                                            "@type": "GoodsProductSpec"
                                                        },
                                                        "productOrder": [
                                                            {
                                                                "orderItemId": "OI2",
                                                                "orderItemAction": "add",
                                                                "orderItemActionSubType": "changeSIM",
                                                                "id": "PO65775",
                                                                "@referredType": "ProductOrder"
                                                            }
                                                        ],
                                                        "relatedParty": [
                                                            {
                                                                "role": "Customer",
                                                                "id": "C3758",
                                                                "@referredType": "Customer",
                                                                "engagedParty": {
                                                                    "id": "I14071",
                                                                    "@referredType": "Individual"
                                                                }
                                                            }
                                                        ],
                                                        "realizingResource": [
                                                            {
                                                                "id": "61583da77e36718d13ee2fdc",
                                                                "@referredType": "SIM",
                                                                "@baseType": "PhysicalResource"
                                                            },
                                                            {
                                                                "name": "GSM(GSM Technology and LOB-SIM) Inventory",
                                                                "id": "c06b134c-40fa-4dac-ad60-070524ce40ff",
                                                                "@referredType": "Resource"
                                                            }
                                                        ],
                                                        "characteristic": [
                                                            {
                                                                "name": "SIMNumber",
                                                                "value": "8923301004013468874",
                                                                "@type": "SIM"
                                                            }
                                                        ],
                                                        "productPrice": [
                                                            {
                                                                "price": {
                                                                    "taxIncludedAmount": {
                                                                        "value": "0",
                                                                        "unit": "GHS"
                                                                    },
                                                                    "dutyFreeAmount": {
                                                                        "value": "0",
                                                                        "unit": "GHS"
                                                                    },
                                                                    "taxRate": 0.0
                                                                }
                                                            },
                                                            {
                                                                "price": {
                                                                    "taxIncludedAmount": {
                                                                        "value": "0",
                                                                        "unit": "GHS"
                                                                    },
                                                                    "dutyFreeAmount": {
                                                                        "value": "0",
                                                                        "unit": "GHS"
                                                                    },
                                                                    "taxRate": 0.0
                                                                }
                                                            }
                                                        ],
                                                        "@baseType": "Product",
                                                        "@type": "Product",
                                                        "isCustomerVisible": false,
                                                        "xDir": "1"
                                                    },
                                                    "modifiable": true
                                                }
                                            ],
                                            "modifiable": false
                                        }
                                    ],
                                    "state": "completed",
                                    "orderDate": "2021-10-11T13:43:59.505Z",
                                    "completionDate": "2021-10-11T13:44:04.045Z",
                                    "requestedStartDate": "2021-10-11T13:43:59.505Z",
                                    "channel": [
                                        {
                                            "name": "DCLM",
                                            "role": "interaction creation",
                                            "id": "dclm",
                                            "@referredType": "Channel",
                                            "@type": "DCLM"
                                        }
                                    ],
                                    "orderTotalPrice": [
                                        {
                                            "price": {
                                                "taxIncludedAmount": {
                                                    "value": "0"
                                                },
                                                "dutyFreeAmount": {
                                                    "value": "0"
                                                },
                                                "taxRate": 0.0
                                            }
                                        },
                                        {
                                            "price": {
                                                "taxIncludedAmount": {
                                                    "value": "0",
                                                    "unit": "GHS"
                                                },
                                                "dutyFreeAmount": {
                                                    "value": "0"
                                                },
                                                "taxRate": 0.0
                                            }
                                        }
                                    ],
                                    "createdDate": "2021-10-11T13:43:59.509Z",
                                    "modifiedDate": "2021-10-11T13:44:04.131Z",
                                    "cancellable": false,
                                    "modifiable": false,
                                    "payment": []
                                },
                                "interactionItemRelationship": []
                            },
                            {
                                "id": "II1",
                                "item": {
                                    "id": "DOC13057",
                                    "href": "",
                                    "externalSystem": [
                                        {
                                            "id": "4503599629442853",
                                            "system": "DMS",
                                            "@type": "workflow"
                                        }
                                    ],
                                    "@baseType": "PartyRole",
                                    "@type": "Document",
                                    "@schemaLocation": "",
                                    "lifecycleState": "pendingUpload",
                                    "documentSpecification": {
                                        "id": "POID"
                                    },
                                    "documentCharacteristic": [
                                        {
                                            "name": "requestType",
                                            "value": "SimChangeRequest"
                                        },
                                        {
                                            "name": "partyInteractionId",
                                            "value": "PI79628"
                                        },
                                        {
                                            "name": "publicIdentifier",
                                            "value": "593003498"
                                        },
                                        {
                                            "name": "channel",
                                            "value": "DCLM"
                                        }
                                    ],
                                    "relatedParty": [
                                        {
                                            "role": "Customer",
                                            "id": "C3758",
                                            "@referredType": "Customer",
                                            "name": "TSSDER AZSXDC",
                                            "engagedParty": {
                                                "id": "I14071",
                                                "@referredType": "Individual",
                                                "@type": "Individual"
                                            }
                                        },
                                        {
                                            "role": "CSRAgent",
                                            "id": "harsha",
                                            "@referredType": "SSOUser",
                                            "name": "harsha",
                                            "contactMedium": [
                                                {
                                                    "medium": {
                                                        "type": "EmailAddress",
                                                        "emailAddress": "harshavardhan.raju@tecnotree.com"
                                                    },
                                                    "type": "EmailAddress",
                                                    "preferred": false
                                                }
                                            ]
                                        }
                                    ],
                                    "relatedEntity": {
                                        "id": "PR21810",
                                        "@referredType": "Customer"
                                    },
                                    "reason": "sxdcf",
                                    "createdDate": "2021-10-11T13:43:51.486Z",
                                    "modifiedDate": "2021-10-11T13:43:58.312Z",
                                    "reminderDate": "2021-10-23T18:30:00.000Z",
                                    "documentDueDate": "2021-10-25T18:30:00.000Z"
                                }
                            }
                        ],
                        "channel": [
                            {
                                "name": "DCLM",
                                "role": "interaction creation",
                                "id": "dclm",
                                "@referredType": "Channel",
                                "@type": "DCLM",
                                "@schemaLocation": "",
                                "href": ""
                            }
                        ],
                        "customerId": [
                            "C3758",
                            "C3016"
                        ],
                        "accountId": [
                            "3678"
                        ],
                        "productId": [
                            "PR21810",
                            "PR19039"
                        ],
                        "publicIdentifier": [
                            "593003498"
                        ],
                        "productOrderId": [
                            "PO65809"
                        ],
                        "createdDate": "2021-10-11T13:42:11.795Z",
                        "modifiedDate": "2021-10-11T13:44:04.481Z",
                        "_internal": {},
                        "@baseType": "PartyInteraction",
                        "@type": "SimChangeRequest",
                        "@schemaLocation": "https://mtnss-uat.mtn.co.ss/partyInteractionManagement/v1/partyInteraction/schema",
                        "retryable": false,
                        "retryableCount": 0
                    }
                ]
                """;
        return ResponseEntity.ok().body(response);
    }
}