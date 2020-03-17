package com.wddlhyss.springcloud.controller;

import com.wddlhyss.springcloud.entities.CommonResult;
import com.wddlhyss.springcloud.entities.Payment;
import com.wddlhyss.springcloud.service.PaymentService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @RequestMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        log.info("******插入结果"+result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getpaymentId(@PathVariable("id") Long id){

        Payment payment = paymentService.getpaymentId(id);
        log.info("******查询结果"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"没有对应记录",null);
        }
    }
}
