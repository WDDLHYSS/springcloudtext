package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayMentMain_8002 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain_8002.class,args);
    }
}
