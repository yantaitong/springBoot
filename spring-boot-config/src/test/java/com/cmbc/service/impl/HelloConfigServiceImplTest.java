package com.cmbc.service.impl;

import com.cmbc.service.HelloConfigService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloConfigServiceImplTest {

    @Autowired
    private HelloConfigService helloConfigService;

    @Test
    public void syaHello() {
        System.out.println(helloConfigService.syaHello());
    }
}