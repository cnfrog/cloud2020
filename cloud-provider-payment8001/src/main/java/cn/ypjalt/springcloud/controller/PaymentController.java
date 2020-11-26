package cn.ypjalt.springcloud.controller;

import cn.ypjalt.springcloud.entities.CommonResult;
import cn.ypjalt.springcloud.entities.Payment;
import cn.ypjalt.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * Date: 2020/11/25
 * Time: 5:19 下午
 * Description: No Description
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果：" + result + "=======");
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败", result);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询数据库成功" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有记录：" + id, null);
        }
    }

}
