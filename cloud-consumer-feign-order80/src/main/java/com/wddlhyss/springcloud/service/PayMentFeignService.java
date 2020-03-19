package com.wddlhyss.springcloud.service;

import com.wddlhyss.springcloud.entities.CommonResult;
import com.wddlhyss.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PayMentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getpaymentId(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

}
