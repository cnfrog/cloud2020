package cn.ypjalt.springcloud.alibaba.controller;

import cn.ypjalt.springcloud.entities.CommonResult;
import cn.ypjalt.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2021/1/28 11:48 下午
 * Description: No Description
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, "34664366363"));
        hashMap.put(2L, new Payment(2L, "35345436436"));
        hashMap.put(3L, new Payment(3L, "36346362666"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200, "sql success from " + serverPort, payment);
        return result;
    }
}
