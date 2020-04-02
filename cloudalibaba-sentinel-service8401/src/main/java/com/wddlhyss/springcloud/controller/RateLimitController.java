package com.wddlhyss.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wddlhyss.springcloud.entities.CommonResult;
import com.wddlhyss.springcloud.entities.Payment;
import com.wddlhyss.springcloud.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud.controller
 * @NAME: RateLimitController
 * @USER: LHY
 * @DATE: 2020/4/2
 * @TIME: 11:33
 * @YEAR: 2020
 * @MONTH: 04
 * @MONTH_NAME_SHORT: 4月
 * @MONTH_NAME_FULL: 四月
 * @DAY: 02
 * @DAY_NAME_SHORT: 周四
 * @DAY_NAME_FULL: 星期四
 * @HOUR: 11
 * @MINUTE: 33
 * @PROJECT_NAME: springcloudtext
 **/
@RestController
public class RateLimitController {
    @GetMapping("/brResource")
    @SentinelResource(value = "brResource", blockHandler = "handleException")
    public CommonResult brResource() {
        return new CommonResult(200, "testOK", new Payment(2020L, "serial001"));
    }

    public CommonResult handleException(BlockException e) {
        return new CommonResult(444, e.getClass().getCanonicalName() + "\t 服务不可调用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")//blockHandler = "handlerException")
    public CommonResult byUrl() {
        return new CommonResult(200, "按url限流测试OK", new Payment(2020L, "serial001"));
    }

    //CustomerBlockHandler
    @GetMapping("/rateLimit/CustomerBlockHandler")
    @SentinelResource(value = "CustomerBlockHandler",blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public CommonResult CustomerBlockHandler(){
        return new CommonResult(200,"按客户自定义限流测试OK", new Payment(2020L, "serial003"));
    }
}
