package com.example.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    @Reference(check = false)
    HelloWorld helloWorld;

    public void sayHello(String name) {
        System.out.println(helloWorld.sayHello(name));
    }
}
