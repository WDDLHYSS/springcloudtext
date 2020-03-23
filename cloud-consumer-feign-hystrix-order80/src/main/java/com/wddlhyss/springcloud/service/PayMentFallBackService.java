package com.wddlhyss.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * 通配服务降级
 */
@Component
public class PayMentFallBackService implements PaymentHystrixService {


    @Override
    public String paymentInfo_ok(Integer id) {
        return "PayMentFallBackService fallback-ok /(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "PayMentFallBackService fallback-timeout /(ㄒoㄒ)/~~";
    }
}
