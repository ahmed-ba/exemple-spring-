package com.bahrini.secondmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecondMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondMicroApplication.class, args);
        System.out.println("second micro-server started....");
    }

}
