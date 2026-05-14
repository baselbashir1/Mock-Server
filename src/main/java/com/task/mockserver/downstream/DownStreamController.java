package com.task.mockserver.downstream;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DownStreamController {

    @GetMapping(value = "/rest/authkey/{AUTHKEY}/msisdn/{MSISDN}/offers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> backendMock(@PathVariable("AUTHKEY") String authKey, @PathVariable("MSISDN") String msisdn) {
        String response = """
                {
                    "status": {
                        "code": 205,
                        "message": "No offers are available"
                    }
                }
                """;
        return ResponseEntity.ok().body(response);
//        return ResponseEntity.ok().body(null);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        return ResponseEntity.badRequest().body(response);
//        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
//        return ResponseEntity.internalServerError().body(response);
    }
}