package com.java.job.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "gateway")
public interface OpenfeignGatewayService {

    @GetMapping("/gateways/testOpenfeign")
    public String testOpenfeign();
}
