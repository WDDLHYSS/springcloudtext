package com.wddlhyss.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

@SuppressWarnings("ALL")
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
