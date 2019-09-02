package com.zhengganwen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启eureka服务，让其他服务注册进来
public class MicorservicecloudEureka7003Application {

    public static void main(String[] args) {
        SpringApplication.run(MicorservicecloudEureka7003Application.class, args);
    }

}
