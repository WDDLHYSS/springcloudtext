package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//启动eureka服务端
@EnableEurekaServer
public class EurekaMain_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain_7001.class,args);
    }
}
