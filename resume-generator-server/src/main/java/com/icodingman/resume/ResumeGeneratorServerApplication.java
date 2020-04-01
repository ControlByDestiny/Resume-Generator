package com.icodingman.resume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages = {"com.icodingman.resume.controllers"})
public class ResumeGeneratorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeGeneratorServerApplication.class, args);
    }

}
