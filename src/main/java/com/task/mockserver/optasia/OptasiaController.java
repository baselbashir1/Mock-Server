package com.task.mockserver.optasia;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OptasiaController {

    @GetMapping(value = "/optasia/v3/madapi/eligibility/offerList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getEligibleBundles(@RequestParam String identityType, @RequestParam String identityValue, @RequestParam String origSource, @RequestParam String commodityType) {
        String response = """
                {
                    "eligibilityStatus": {
                        "isEligible": true,
                        "eligibilityStatus": "Eligible",
                        "eligibilityStatusByCommodity": [
                            {
                                "eligibilityStatus": "Eligible",
                                "commodityType": "BUNDLE"
                            },
                            {
                                "eligibilityStatus": "Eligible",
                                "commodityType": "AIRTIME"
                            }
                        ]
                    },
                    "loanOffersByCommodity": [
                        {
                            "commodityType": "AIRTIME",
                            "loanOffers": [
                                {
                                    "offerClass": "FIXED",
                                    "offerName": "USD010",
                                    "advanceOfferId": "3jSfpNx",
                                    "currencyCode": "USD",
                                    "principalAmount": 0.1,
                                    "setupFees": 0.01,
                                    "commodityType": "AIRTIME",
                                    "loanPlanId": "1",
                                    "loanPlanName": "Standard Plan",
                                    "maturityDetails": {
                                        "maturityDuration": 3650,
                                        "dueOffsetInDays": 0
                                    }
                                }
                            ]
                        },
                        {
                            "commodityType": "BUNDLE",
                            "loanOffers": [
                                {
                                    "offerClass": "FIXED-BUNDLE",
                                    "offerName": "USD010-BUNDLE",
                                    "advanceOfferId": "3jSfpNx-BUNDLE",
                                    "currencyCode": "USD",
                                    "principalAmount": 0.1,
                                    "setupFees": 0.01,
                                    "commodityType": "BUNDLE",
                                    "loanPlanId": "1",
                                    "loanPlanName": "Standard Plan-BUNDLE",
                                    "maturityDetails": {
                                        "maturityDuration": 3650,
                                        "dueOffsetInDays": 0
                                    }
                                }
                            ]
                        }
                    ],
                    "outstandingStatus": [
                        {
                            "currencyCode": "USD",
                            "numOutstandingLoans": 0,
                            "totalGross": 0.0,
                            "totalPrincipal": 0.0,
                            "totalSetupFees": 0.0,
                            "totalInterest": 0.0,
                            "totalInterestVAT": 0.0,
                            "totalCharges": 0.0,
                            "totalChargesVAT": 0.0,
                            "dynamicCreditLimit": 17.91,
                            "totalPendingLoans": 0.0,
                            "totalPendingRecoveries": 0.0,
                            "availableCreditLimit": 17.91
                        }
                    ]
                }
                """;
        return ResponseEntity.ok().body(response);
    }
}