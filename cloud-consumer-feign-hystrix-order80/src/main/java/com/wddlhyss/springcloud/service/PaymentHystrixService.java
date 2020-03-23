package com.wddlhyss.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PROVIDE-HTSTRIX-PAYMENT", fallback = PayMentFallBackService.class)
public interface PaymentHystrixService {
    @GetMapping(value = "/payment/hystix_ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/hystix_timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id);



}
