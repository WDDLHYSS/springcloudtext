package com.wddlhyss.springcloud.controller;

import com.wddlhyss.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverport;

    @GetMapping(value = "/payment/hystix_ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_ok(id);
        log.info(result);
        return result;
    }

    @GetMapping(value = "/payment/hystix_timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id){

        String result = paymentService.paymentInfo_timeout(id);
        log.info(result);
        return result;
    }


}
