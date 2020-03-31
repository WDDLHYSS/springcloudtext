package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud
 * @NAME: PayMentMain_9001
 * @USER: LHY
 * @DATE: 2020/3/28
 * @TIME: 14:14
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 28
 * @DAY_NAME_SHORT: 周六
 * @DAY_NAME_FULL: 星期六
 * @HOUR: 14
 * @MINUTE: 14
 * @PROJECT_NAME: springcloudtext
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class PayMentMain_9002 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain_9002.class,args);
    }
}
