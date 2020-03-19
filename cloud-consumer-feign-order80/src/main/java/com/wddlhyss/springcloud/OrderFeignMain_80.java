package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//开启feign注解
@EnableFeignClients
public class OrderFeignMain_80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain_80.class,args);
    }
}
