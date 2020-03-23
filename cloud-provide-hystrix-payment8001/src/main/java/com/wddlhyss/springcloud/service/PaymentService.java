package com.wddlhyss.springcloud.service;

import ch.qos.logback.core.util.TimeUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String paymentInfo_ok(Integer id){
        return "线程池："+Thread.currentThread().getName()+"  paymentInfo_ok,id:"+id+"\t"+"O(∩_∩)O";
    }


    @HystrixCommand(fallbackMethod ="paymentInfo_TimeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_timeout(Integer id){
        int timenumber = 5;
        int age=10/0;
       /* try {
            TimeUnit.SECONDS.sleep(timenumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "线程池："+Thread.currentThread().getName()+"  paymentInfo_timeout,id:"+id+"\t"+"O(∩_∩)O"+"耗时3s";
    }

    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"  paymentInfo_timeout,id:"+id+"\t"+"/(ㄒoㄒ)/~~";
    }
}
