package com.task.mockserver.comviva;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSMController {

    // http://172.25.10.111:8087/AFL/activationReq
    @PostMapping(value = "/AFL/activationReq", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> subscribe(@RequestBody String body) {
        String response = """
                <ocsResponse>
                    <serviceType></serviceType>
                    <resultCode>3099</resultCode>
                    <result>Invalid plan ID</result>
                    <sequenceNo>test14522</sequenceNo>
                    <callingParty>2609132059261</callingParty>
                    <cpcgFlag>10</cpcgFlag>
                    <calledParty>-1</calledParty>
                    <bearerId>wwwwff</bearerId>
                    <startTime>260908081742</startTime>
                    <planId>12345</planId>
                    <serviceNode></serviceNode>
                    <serviceId></serviceId>
                    <requestType>20</requestType>
                    <inTranxId></inTranxId>
                    <inResultCode></inResultCode>
                </ocsResponse>
                """;

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}