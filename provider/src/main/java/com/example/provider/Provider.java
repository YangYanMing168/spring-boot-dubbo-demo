package com.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class Provider {
    public static void main(String[]args) throws IOException {
        SpringApplication.run(Provider.class,args);
        System.in.read();
    }
}
