package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PayMentMain_8006 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain_8006.class,args);
    }
}
