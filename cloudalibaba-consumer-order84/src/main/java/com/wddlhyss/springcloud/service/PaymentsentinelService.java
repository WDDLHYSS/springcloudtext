package com.wddlhyss.springcloud.service;


import com.wddlhyss.springcloud.entities.CommonResult;
import com.wddlhyss.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentsentinelService {

    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> PaymentSQL(@PathVariable("id") Long id);
}