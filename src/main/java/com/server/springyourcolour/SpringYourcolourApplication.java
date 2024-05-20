package com.server.springyourcolour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringYourcolourApplication {


    public static void main(String[] args) {
        String str = "nun";
        for (int i = 0; i < 5; i++) {
            System.out.print(str);
        }

        SpringApplication.run(SpringYourcolourApplication.class, args);
    }

}
