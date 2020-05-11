package com.icodingman.resume.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试相关接口")
public class TestController {

    @GetMapping("/hello")
    @ResponseBody
    public String HelloWorld(){
        return "{\"message\": \"Hello World\"}";
    }
}
