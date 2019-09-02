package com.zhengganwen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient     //声明是eureka的客户端
@EnableDiscoveryClient  //服务发现
public class MicorservicecloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicorservicecloudConsumerApplication.class, args);
    }

}
