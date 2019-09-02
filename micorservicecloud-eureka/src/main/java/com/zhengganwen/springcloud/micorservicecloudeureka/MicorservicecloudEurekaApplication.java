package com.zhengganwen.springcloud.micorservicecloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //开启eureka服务,其他微服务可以注册进来
public class MicorservicecloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicorservicecloudEurekaApplication.class, args);
    }

}
