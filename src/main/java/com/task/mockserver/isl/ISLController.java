package com.task.mockserver.isl;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ISLController {

    @PostMapping(value = "/v1/enrollments/simSwapNotification/{enrollmentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSubscriptionDetails(@PathVariable String enrollmentId, Object data) {
        String response = """
                {
                    "code": "200",
                    "message": "Transaction is successful",
                    "trxId": "A1B2C3D4E5F60718293A4B5C6D7E8F90"
                }
                """;
        return ResponseEntity.ok().body(response);
    }
}