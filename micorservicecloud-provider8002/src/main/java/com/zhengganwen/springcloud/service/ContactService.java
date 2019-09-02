package com.zhengganwen.springcloud.service;

import com.zhengganwen.springcloud.entity.Contact;

import java.util.List;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:
 */
public interface ContactService {
    List<Contact> findAll();
}
