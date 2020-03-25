package com.wddlhyss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud
 * @NAME: ConfigCenterMain_3344
 * @USER: LHY
 * @DATE: 2020/3/25
 * @TIME: 17:47
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 25
 * @DAY_NAME_SHORT: 周三
 * @DAY_NAME_FULL: 星期三
 * @HOUR: 17
 * @MINUTE: 47
 * @PROJECT_NAME: springcloudtext
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain_3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain_3344.class,args);
    }
}
