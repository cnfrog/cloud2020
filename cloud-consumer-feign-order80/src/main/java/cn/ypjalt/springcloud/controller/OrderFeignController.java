package cn.ypjalt.springcloud.controller;

import cn.ypjalt.springcloud.service.PaymentFeignService;
import cn.ypjalt.springcloud.entities.CommonResult;
import cn.ypjalt.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2020/11/27 9:57 上午
 * Description: No Description
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut() {
        // openfeign - ribbon,客户端默认等待1s，超时报错
        return paymentFeignService.paymentFeignTimeOut();
    }
}
