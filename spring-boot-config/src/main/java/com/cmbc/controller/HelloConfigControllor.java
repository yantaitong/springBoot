package com.cmbc.controller;


import com.cmbc.service.HelloConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConfigControllor {

    private static final Logger logger = LoggerFactory.getLogger(HelloConfigControllor.class);

    @Autowired
    private HelloConfigService helloConfigService;

    @RequestMapping("/sayHelloConfig")
    private String sayHelloConfig(){

        return "Hello Config";
    }
    @RequestMapping("/sayHelloConfig1")
    public String sayHelloConfig1(){
      return   helloConfigService.syaHello();
    }
}
