package com.cmbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController等价于@ResponseBody+@Controller，返回对象自动转为json串
 */
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {

    //    @ResponseBody
    @RequestMapping
    private String hello() {
        return "hello world!";
    }

}
