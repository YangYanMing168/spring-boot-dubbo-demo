package com.example.provider;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.HelloWorld;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldImplTest {
    @Reference
    private HelloWorld helloWorld;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sayHello() throws Exception {
        helloWorld.sayHello("KamYang");
    }

}