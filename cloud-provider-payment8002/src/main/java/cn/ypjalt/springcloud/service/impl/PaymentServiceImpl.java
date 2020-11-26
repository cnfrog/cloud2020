package cn.ypjalt.springcloud.service.impl;

import cn.ypjalt.springcloud.dao.PaymentDao;
import cn.ypjalt.springcloud.entities.Payment;
import cn.ypjalt.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * Date: 2020/11/25
 * Time: 5:17 下午
 * Description: No Description
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
