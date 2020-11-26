package cn.ypjalt.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2020/11/26 9:53 下午
 * Description: No Description
 */
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
