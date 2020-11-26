package cn.ypjalt.springcloud.service;

import cn.ypjalt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * Date: 2020/11/25
 * Time: 5:16 下午
 * Description: No Description
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
