package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
public class Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }

}
