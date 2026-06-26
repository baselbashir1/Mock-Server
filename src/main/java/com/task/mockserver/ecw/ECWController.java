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
        String successResponse = """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                <ns2:getbalancerequest xmlns:ns2="http://www.ericsson.com/em/emm/financial/v1_2">
                    <fri>FRI:260765647419/MSISDN</fri>
                    <includereservations>false</includereservations>
                    <quoteid>null</quoteid>
                </ns2:getbalancerequest>
                """;

        String badRequestResponse = """
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
        return new ResponseEntity<>(badRequestResponse, HttpStatus.BAD_REQUEST);
    }

    @PostMapping(value = "/madapi/debit", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> debit(@RequestBody String body) {
        String badRequestResponse = """
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
        return new ResponseEntity<>(badRequestResponse, HttpStatus.BAD_REQUEST);
    }
}