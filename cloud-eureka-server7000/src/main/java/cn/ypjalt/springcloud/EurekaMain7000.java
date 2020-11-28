package cn.ypjalt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 * User: yuanpengjun
 * DateTime: 2020/11/28 11:00 上午
 * Description: No Description
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7000 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7000.class, args);
    }
}
