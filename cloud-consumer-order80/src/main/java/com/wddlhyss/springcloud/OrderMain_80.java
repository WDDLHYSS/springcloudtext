package com.wddlhyss.springcloud;

import com.wddlhyss.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SuppressWarnings("ALL")
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyRule.class)
public class OrderMain_80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain_80.class,args);
    }
}
