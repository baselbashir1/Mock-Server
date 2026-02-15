package com.task.mockserver.controller.cbp;

import com.task.mockserver.dto.cbp.SubscriptionDetailsResponse;
import com.task.mockserver.service.cbp.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/basel")
public class Controller {

    @GetMapping
    public List<SubscriptionDetailsResponse> getSubscriptionDetails() {
        return Service.buildResponse();
    }
}