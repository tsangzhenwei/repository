package com.java.job.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/gateways")
public class Controller {

    @GetMapping("/testOpenfeign")
    public String testOpenfeign(){
        return "OpenFeign测试：恭喜，连接成功。";
    }
}
