package com.wddlhyss.springcloud.controller;

import com.wddlhyss.springcloud.entities.CommonResult;
import com.wddlhyss.springcloud.entities.Payment;
import com.wddlhyss.springcloud.service.PayMentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PayMentFeignService payMentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayMentById(@PathVariable("id") Long id){
        return payMentFeignService.getpaymentId(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign底层为ribbon，客户端默认等待1s中
        return payMentFeignService.paymentFeignTimeout();
    }
}
