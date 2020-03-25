package com.wddlhyss.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author wddlhyss
 * @PACKAGE_NAME: com.wddlhyss.springcloud.config
 * @NAME: GateWayConfig
 * @USER: LHY
 * @DATE: 2020/3/25
 * @TIME: 15:00
 * @YEAR: 2020
 * @MONTH: 03
 * @MONTH_NAME_SHORT: 3月
 * @MONTH_NAME_FULL: 三月
 * @DAY: 25
 * @DAY_NAME_SHORT: 周三
 * @DAY_NAME_FULL: 星期三
 * @HOUR: 15
 * @MINUTE: 00
 * @PROJECT_NAME: springcloudtext
 **/

@Component
public class GateWayConfig {

    /**
     *
     * @param routeLocatorBuilder
     * @return
     * 配置了一个id为route：name的路由规则
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("patk_route_wddlhyss",
                r->r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator guojiRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("patk_route_wddlhyss1",
                r->r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }

}
