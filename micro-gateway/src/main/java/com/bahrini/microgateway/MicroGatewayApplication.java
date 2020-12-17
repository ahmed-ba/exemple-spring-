package com.bahrini.microgateway;

import com.bahrini.microgateway.filters.ErrorFilter;
import com.bahrini.microgateway.filters.PostFilter;
import com.bahrini.microgateway.filters.PreFilter;
import com.bahrini.microgateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class MicroGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroGatewayApplication.class, args);
        System.out.println("Gateway server is running...");
    }
    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
