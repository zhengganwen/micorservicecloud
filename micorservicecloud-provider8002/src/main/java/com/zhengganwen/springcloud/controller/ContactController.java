package com.zhengganwen.springcloud.controller;

import com.zhengganwen.springcloud.entity.Contact;
import com.zhengganwen.springcloud.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
   private  ContactService contactService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/getContact")
    public List<Contact> find(){
        List<Contact> all = contactService.findAll();
        return all;
    }


    @GetMapping(value = "/provider/discovery")
    public Object discovery(){

        return this.discoveryClient;
    }



}
