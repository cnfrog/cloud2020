package cn.ypjalt.springcloud.service;

import cn.ypjalt.springcloud.entities.CommonResult;
import cn.ypjalt.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2020/11/27 9:53 上午
 * Description: No Description
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeOut();
}
