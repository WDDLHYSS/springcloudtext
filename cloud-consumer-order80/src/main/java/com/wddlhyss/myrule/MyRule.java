package com.wddlhyss.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("ALL")
@Configuration
public class MyRule {

    @Bean
    public IRule myselfRule(){
        return new RandomRule();//自定义为随机
    }
}
