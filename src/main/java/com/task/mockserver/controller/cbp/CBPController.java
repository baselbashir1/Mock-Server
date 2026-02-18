package com.task.mockserver.controller.cbp;

import com.task.mockserver.service.cbp.CBPService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
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

        return ResponseEntity.status(HttpStatus.OK).body(CBPService.buildResponse());
    }
}