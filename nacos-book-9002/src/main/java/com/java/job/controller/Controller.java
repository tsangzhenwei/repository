package com.java.job.controller;

import com.java.job.service.OpenfeignGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/books")
public class Controller {

    @Autowired
    private OpenfeignGatewayService openfeignGatewayService;

    @GetMapping("/test")
    public String test(){
        return "这是booksssss测试，连接成功。。。。。";
    }

    @GetMapping("/testOpenfeign")
    public String testOpenfeign(){
        return openfeignGatewayService.testOpenfeign();
    }
}
