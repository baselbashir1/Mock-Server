package com.task.mockserver.ecw;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECWController {

    @PostMapping(value = "/madapi/getbalance", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> getBalance(@RequestBody String body) {
        String response = """
                <?xml version='1.0' encoding='utf-8'?>
                <soap:Envelope xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'>
                    <soap:Body>
                        <soap:Fault>
                            <faultcode>soap:Client</faultcode>
                            <faultstring>The requested operation was rejected. Please consult with your administrator.Your support ID is: 3268612619274546442</faultstring>
                            <detail/>
                        </soap:Fault>
                    </soap:Body>
                </soap:Envelope>
                """;
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}