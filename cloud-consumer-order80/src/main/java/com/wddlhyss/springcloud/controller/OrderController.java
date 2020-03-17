package com.wddlhyss.springcloud.controller;

import com.wddlhyss.springcloud.entities.CommonResult;
import com.wddlhyss.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";
    /**
     * RestTemplate提供了多种便捷的访问远程Http服务的方法
     * 是一种简单便捷的访问restful服务模板类，时spring提供的用于访问rest服务的客户端模板工具集
     * （url,requestMap,ResponseBean.class）这三个参数分别表示rest请求地址，请求参数，http响应转换被转换成的对象类型
     */
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

}
