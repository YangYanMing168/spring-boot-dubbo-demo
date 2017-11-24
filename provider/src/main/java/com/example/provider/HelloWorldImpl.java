package com.example.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.HelloWorld;

@Service
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHello(String string) {
        System.out.println("this is provider " + string);
        return "hello " + string;
    }
}
