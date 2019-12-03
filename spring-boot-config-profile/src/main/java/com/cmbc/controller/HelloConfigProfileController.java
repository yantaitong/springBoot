package com.cmbc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConfigProfileController {

    @RequestMapping("sayHelloConfigProfile")
    private String sayHelloConfigProfile(){

        return "Hello ConfigProfile";
    }
}
