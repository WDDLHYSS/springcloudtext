package com.wddlhyss.springcloud.service;

import com.wddlhyss.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService {
    public int create(Payment payment);

    public Payment getpaymentId(@Param("id") Long id);
}
