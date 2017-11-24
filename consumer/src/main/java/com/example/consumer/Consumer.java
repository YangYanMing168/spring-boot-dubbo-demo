package com.example.consumer;

import com.example.api.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")

public class Consumer {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Consumer.class, args);
        Controller controller = context.getBean(Controller.class);
//        HelloWorld hello = (HelloWorld) context.getBean("hello");
//        System.out.println(hello.sayHello("KamYang"));
        controller.sayHello("KamYang");
        System.exit(0);
    }
}
