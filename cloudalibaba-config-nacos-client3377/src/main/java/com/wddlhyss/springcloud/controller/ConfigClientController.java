package com.wddlhyss.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud.controller
 * @NAME: ConfigClientController
 * @USER: LHY
 * @DATE: 2020/3/31
 * @TIME: 10:53
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 31
 * @DAY_NAME_SHORT: 周二
 * @DAY_NAME_FULL: 星期二
 * @HOUR: 10
 * @MINUTE: 53
 * @PROJECT_NAME: springcloudtext
 **/
@RestController
@RefreshScope //支持nacos自动刷新功能
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
