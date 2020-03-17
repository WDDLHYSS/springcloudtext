package com.wddlhyss.springcloud.service.impl;

import com.wddlhyss.springcloud.dao.PaymentDao;
import com.wddlhyss.springcloud.entities.Payment;
import com.wddlhyss.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getpaymentId(Long id) {
        return paymentDao.getpaymentId(id);
    }
}
