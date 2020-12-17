package cn.ypjalt.springcloud.controller;

import cn.ypjalt.springcloud.service.IMeaasgeProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2020/12/8 12:03 上午
 * Description: No Description
 */
@RestController
public class SendMessageController {
    @Resource
    public IMeaasgeProvider meaasgeProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return meaasgeProvider.send();
    }
}
