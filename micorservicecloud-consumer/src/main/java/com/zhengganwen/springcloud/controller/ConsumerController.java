package com.zhengganwen.springcloud.controller;

import com.zhengganwen.springcloud.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {
   // private static  final  String PURL ="http://127.0.0.1:8001";

    //通过微服务的名字找到服务
    private static  final  String PURL ="http://MICROSERVICECLOUD-CONTACT";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/consumer/get")
    public List<Contact> getContact(){

        return restTemplate.getForObject(PURL+"/getContact",List.class);
    }

    @GetMapping(value = "/consumer/discovery")
    public Object discovery(){
        return this.discoveryClient;
    }
}
