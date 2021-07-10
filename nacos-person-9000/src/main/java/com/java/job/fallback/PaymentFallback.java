package com.java.job.fallback;

import com.java.job.service.FeignPaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallback implements FeignPaymentService {
    @Override
    public String getPaymentsTest() {
        return "我是兜底的方法";
    }
}
