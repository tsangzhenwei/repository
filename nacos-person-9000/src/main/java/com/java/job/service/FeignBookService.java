package com.java.job.service;

import com.java.job.fallback.BookFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "book",fallback = BookFallback.class)
public interface FeignBookService {

    @GetMapping("/books/test")
    public String test();
}
