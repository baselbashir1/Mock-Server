package com.task.mockserver.ewp;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EWPController {

    @PostMapping(value = "/madapi/payment", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> payment(@RequestBody String body) {
        System.out.println(body);

        String response = """
                <?xml version="1.0" encoding="UTF-8"?>
                <ns10:paymentresponse xmlns:ns10="http://www.ericsson.com/em/emm/serviceprovider/v1_1/frontend" xmlns:fic="http://www.ericsson.com/em/emm/financial/v1_2/common" xmlns:ns11="http://www.ericsson.com/em/emm/financial/v1_2" xmlns:ns12="http://www.ericsson.com/em/emm/financial/v1_0" xmlns:ns13="http://www.ericsson.com/em/emm/financial/v1_1" xmlns:ns4="http://www.ericsson.com/em/emm/financial/v1_0/common" xmlns:ns5="http://www.ericsson.com/em/emm/v2_1/common" xmlns:ns6="http://www.ericsson.com/em/emm/financial/v1_1/common" xmlns:ns8="http://www.ericsson.com/em/emm/v1_1/common" xmlns:op="http://www.ericsson.com/em/emm/v1_0/common" xmlns:spc="http://www.ericsson.com/em/emm/serviceprovider/v1_0/common" xmlns:xs="http://www.w3.org/2001/XMLSchema">
                    <fee>
                        <amount>0.00</amount>
                        <currency>ZMW</currency>
                    </fee>
                    <transactionid>538195</transactionid>
                </ns10:paymentresponse>
                """;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}