package com.bahrini.microauthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroAuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroAuthServiceApplication.class, args);
          System.out.println("Authorization server started....");}
}
