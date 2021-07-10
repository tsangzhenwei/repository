package com.java.job.service;

import com.java.job.fallback.PaymentFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "payment",fallback = PaymentFallback.class)
public interface FeignPaymentService {

    @GetMapping("/payments/test")
    public String getPaymentsTest();
}
