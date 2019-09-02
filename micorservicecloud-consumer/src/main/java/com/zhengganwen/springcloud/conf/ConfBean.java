package com.zhengganwen.springcloud.conf;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfBean {

    @Bean
    @LoadBalanced   //ribbond的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 设置ribbon负载均衡为随机
     * @return
     */
    @Bean
    public IRule setRule(){
        return new RandomRule();
    }
}
