package cn.ypjalt.springcloud.alibaba.service;

import cn.ypjalt.springcloud.entities.CommonResult;
import cn.ypjalt.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2021/1/29 2:24 下午
 * Description: No Description
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回", new Payment(id, "error"));
    }
}
