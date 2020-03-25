package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud
 * @NAME: ConfigClientMain_3355
 * @USER: LHY
 * @DATE: 2020/3/25
 * @TIME: 19:07
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 25
 * @DAY_NAME_SHORT: 周三
 * @DAY_NAME_FULL: 星期三
 * @HOUR: 19
 * @MINUTE: 07
 * @PROJECT_NAME: springcloudtext
 **/

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain_3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain_3355.class,args);
    }
}
