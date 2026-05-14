package com.task.mockserver.acs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class AuthController {

    @PostMapping(value = "/connect/token", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> getToken(@RequestBody Map<String, String> requestBody) {

        String clientId = requestBody.get("clientId");
        String clientSecret = requestBody.get("clientSecret");
        String scope = requestBody.get("scope");
        String grantType = requestBody.get("grantType");

        System.out.println("Received token request for client_id: " + clientId);
        System.out.println("Scope: " + scope + " Grant Type: " + grantType);

        // Create the session token data
        LinkedHashMap<String, Object> sessionData = new LinkedHashMap<>();
        sessionData.put("sessionToken", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c");
        sessionData.put("expires_in", 3600);
        sessionData.put("token_type", "Bearer");
        sessionData.put("scope", scope);

        // Create the main response
        Map<String, Object> response = new HashMap<>();
        response.put("data", sessionData);
        response.put("success", true);
        response.put("message", "Token retrieved successfully");
        response.put("statusCode", 200);
        response.put("transactionId", System.currentTimeMillis());

        return ResponseEntity.ok(response);
    }
}