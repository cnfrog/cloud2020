package cn.ypjalt.springcloud.service.impl;

import cn.ypjalt.springcloud.service.IMeaasgeProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2020/12/7 11:55 下午
 * Description: No Description
 */
@EnableBinding(Source.class) // 定义消息的推送管道
public class MeaasgeProviderImpl implements IMeaasgeProvider {

    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send() {
        String msg = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(msg).build());
        System.out.println("*****msg: "+msg);
        return null;
    }
}
