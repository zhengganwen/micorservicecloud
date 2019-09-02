package com.zhengganwen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //开启eureka服务，让其他服务可以注册进来
public class MicorservicecloudEureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicorservicecloudEureka7002Application.class, args);
    }

}
