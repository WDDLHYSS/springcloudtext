package com.wddlhyss.springcloud.controller;

import javafx.scene.control.Skin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud.controller
 * @NAME: ReciveMessageListerController
 * @USER: LHY
 * @DATE: 2020/3/27
 * @TIME: 23:13
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 27
 * @DAY_NAME_SHORT: 周五
 * @DAY_NAME_FULL: 星期五
 * @HOUR: 23
 * @MINUTE: 13
 * @PROJECT_NAME: springcloudtext
 **/
@Component
@EnableBinding(Sink.class)

public class ReciveMessageListerController {

    @Value("${server.port}")
    private String serverport;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者1号，------>接收到消息："+message.getPayload()+"\t port:"+serverport);
    }
}
