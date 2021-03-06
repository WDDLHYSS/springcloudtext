package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //该注解用于使用consul或zookeeper作为注册中心时注册服务
public class PayMentMain_8004 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain_8004.class,args);
    }
}
