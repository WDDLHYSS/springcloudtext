package com.wddlhyss.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud.controller
 * @NAME: OrderController
 * @USER: LHY
 * @DATE: 2020/3/28
 * @TIME: 14:38
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 28
 * @DAY_NAME_SHORT: 周六
 * @DAY_NAME_FULL: 星期六
 * @HOUR: 14
 * @MINUTE: 38
 * @PROJECT_NAME: springcloudtext
 **/
@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        return restTemplate.getForObject(serverURL + "/payment/getpayment/" + id, String.class);
    }
}
