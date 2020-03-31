package com.wddlhyss.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud.controller
 * @NAME: PayMentController
 * @USER: LHY
 * @DATE: 2020/3/28
 * @TIME: 14:15
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 28
 * @DAY_NAME_SHORT: 周六
 * @DAY_NAME_FULL: 星期六
 * @HOUR: 14
 * @MINUTE: 15
 * @PROJECT_NAME: springcloudtext
 **/
@RestController
public class PayMentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/getpayment/{id}")
    public String getPayMent(@PathVariable("id") Integer id){
        return "nacos register serverport:"+serverPort+"\t id:"+id;
    }
}
