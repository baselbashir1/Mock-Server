package com.task.mockserver.masking;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/masking")
public class MaskingController {

    @GetMapping("/customers/{id}/subscriptions")
    public ResponseEntity<?> handleUID(@PathVariable String id) {
        return ResponseEntity.ok("26012536");
    }
}