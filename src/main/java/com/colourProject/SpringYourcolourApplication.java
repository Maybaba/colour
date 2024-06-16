package com.colourProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.colourProject.mapper")
public class SpringYourcolourApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringYourcolourApplication.class, args);
        }


    }

