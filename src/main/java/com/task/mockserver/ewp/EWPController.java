package com.task.mockserver.ewp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/payments")
public class EWPController {

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> payments() {
        String response = """
                <ns0:paymentrequest xmlns:ns0="http://www.ericsson.com/em/emm/serviceprovider/v1_1/frontend">
                    <referenceid>referenceid</referenceid>
                    <sendingfri>FRI:260765647419/MSISDN</sendingfri>
                    <receivingfri>FRI:260967738080@airtime.OCS/SP</receivingfri>
                    <amount>
                        <amount>15.00</amount>
                        <currency>ZMW</currency>
                    </amount>
                    <sendernote>sendernote</sendernote>
                    <receivermessage>receivermessage</receivermessage>
                    <includesendercharges>false</includesendercharges>
                </ns0:paymentrequest>
                """;
        return ResponseEntity.ok().body(response);
    }
}