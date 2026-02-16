package com.task.mockserver.controller.cbp;

import com.task.mockserver.service.cbp.CBPService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/tmf-api/productManagement/v4")
public class CBPController {

    @GetMapping("/product")
    public ResponseEntity<?> getSubscriptionDetails(
            @RequestParam(value = "realizingResource.id", required = false) String realizingResourceId,
            @RequestParam(value = "productOffering.id", required = false) String productOfferingId,
            @RequestHeader(value = "correlationId", required = false) String correlationId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(CBPService.buildResponse());
    }

    @GetMapping("/failure")
    public ResponseEntity<?> getFailure() {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(CBPService.buildFailure());
    }
}