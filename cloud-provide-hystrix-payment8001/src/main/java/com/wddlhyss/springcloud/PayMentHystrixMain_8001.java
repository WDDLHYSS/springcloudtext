package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker //启动服务降级
public class PayMentHystrixMain_8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentHystrixMain_8001.class,args);
    }
}
