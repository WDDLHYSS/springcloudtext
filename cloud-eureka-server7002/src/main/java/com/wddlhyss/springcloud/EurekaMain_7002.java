package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.regex.PatternSyntaxException;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain_7002 {
    public static void main(String[] args) {
            SpringApplication.run(EurekaMain_7002.class,args);
    }
}
