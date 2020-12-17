package com.bahrini.fisrtmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FisrtMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(FisrtMicroApplication.class, args);
        System.out.println("first micro-server started....");
    }

}
