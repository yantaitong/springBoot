package com.cmbc.service.impl;

import com.cmbc.service.HelloConfigService;
import org.springframework.stereotype.Service;

@Service
public class HelloConfigServiceImpl implements HelloConfigService {

    @Override
    public String syaHello() {
        return "hello Config!";
    }
}
