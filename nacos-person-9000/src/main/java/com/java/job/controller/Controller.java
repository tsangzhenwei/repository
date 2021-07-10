package com.java.job.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.java.job.blockHandler.BlockHandler;
import com.java.job.service.FeignBookService;
import com.java.job.service.FeignPaymentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RefreshScope
@RequestMapping("/persons")
public class Controller {

    @Autowired
    private FeignPaymentService feignPaymentService;
    @Autowired
    private FeignBookService feignBookService;


    @GetMapping("/test/{id}")
    @ApiOperation("测试接口")
    @ApiImplicitParams({
         @ApiImplicitParam(name = "id",value = "用户id",required = true,paramType = "query",dataType = "string"),
         @ApiImplicitParam(name = "username",value = "用户名",required = true,paramType = "query",dataType = "string"),
         @ApiImplicitParam(name = "password",value = "用户密码",required = true,paramType = "query",dataType = "string")
    })
    public String test(@PathVariable("id") int id){
        return "person测试哦，，连接成功";
    }

    @GetMapping("/testOpenfeign")
    public String testOpenfeign(){
        return feignPaymentService.getPaymentsTest();
    }

    @GetMapping("/test1")
    @SentinelResource(value="test1",blockHandlerClass=BlockHandler.class,blockHandler="blockHandler")
    public String test(){
        return feignBookService.test();
    }


    @GetMapping("/testa")
    public String testA(){
        return "-----------Test----A";
    }

    @GetMapping("/testb")
    public String testB(){
        return "-----------Test----B";
    }

    @GetMapping("/testc")
    public String testC(){
        return "-----------Test----C";
    }

}
