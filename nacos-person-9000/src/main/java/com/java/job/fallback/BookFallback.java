package com.java.job.fallback;

import com.java.job.service.FeignBookService;
import com.java.job.service.FeignPaymentService;
import org.springframework.stereotype.Component;

@Component
public class BookFallback implements FeignBookService {


    @Override
    public String test() {
        return "服务器异常，请稍后再试...";
    }
}
