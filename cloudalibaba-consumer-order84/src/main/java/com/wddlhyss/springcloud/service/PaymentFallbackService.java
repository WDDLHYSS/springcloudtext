package com.wddlhyss.springcloud.service;


import com.wddlhyss.springcloud.entities.CommonResult;
import com.wddlhyss.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentFallbackService implements PaymentsentinelService {
    @Override
    public CommonResult<Payment> PaymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回，----PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}