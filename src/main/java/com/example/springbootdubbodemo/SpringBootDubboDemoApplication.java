package com.example.springbootdubbodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDubboDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboDemoApplication.class, args);
		User user = new User();
		user.setName("KamYang");
		user.setAge(12);
		Student student = new Student();
		student.setName("Kamyang");
		System.out.println(user.toString());
		System.out.println(student.toString());
	}
}
