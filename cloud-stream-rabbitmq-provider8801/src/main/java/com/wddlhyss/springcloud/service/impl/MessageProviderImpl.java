package com.wddlhyss.springcloud.service.impl;

import com.wddlhyss.springcloud.service.MessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;


import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud.service.impl
 * @NAME: MessageProviderImpl
 * @USER: LHY
 * @DATE: 2020/3/27
 * @TIME: 20:58
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 27
 * @DAY_NAME_SHORT: 周五
 * @DAY_NAME_FULL: 星期五
 * @HOUR: 20
 * @MINUTE: 58
 * @PROJECT_NAME: springcloudtext
 **/

@EnableBinding(Source.class)  //定义消息的推送管道
public class MessageProviderImpl implements MessageProvider {

    @Resource
    private MessageChannel output; //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: " +serial);
        return null;
    }
}
