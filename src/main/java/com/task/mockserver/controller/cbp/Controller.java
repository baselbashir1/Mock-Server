package com.task.mockserver.controller.cbp;

import com.task.mockserver.service.cbp.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/basel")
public class Controller {

    @GetMapping
    public ResponseEntity<?> getSubscriptionDetails() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Service.buildResponse());
    }

    @GetMapping("/failure")
    public ResponseEntity<?> getFailure() {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Service.buildFailure());
    }
}