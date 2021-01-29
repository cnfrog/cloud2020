package cn.ypjalt.springcloud.alibaba.service;

import cn.ypjalt.springcloud.entities.CommonResult;
import cn.ypjalt.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2021/1/29 2:21 下午
 * Description: No Description
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
