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
}