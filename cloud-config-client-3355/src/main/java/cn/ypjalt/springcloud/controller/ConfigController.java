package cn.ypjalt.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2020/12/2 11:11 下午
 * Description: No Description
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${config}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
