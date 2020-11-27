package cn.ypjalt.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2020/11/27 11:55 上午
 * Description: No Description
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }
}
