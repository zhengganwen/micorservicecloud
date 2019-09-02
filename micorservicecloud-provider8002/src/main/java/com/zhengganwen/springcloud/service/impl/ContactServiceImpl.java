package com.zhengganwen.springcloud.service.impl;

import com.zhengganwen.springcloud.entity.Contact;
import com.zhengganwen.springcloud.mapper.ContactMapper;
import com.zhengganwen.springcloud.service.ContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:
 */
@Service
public class ContactServiceImpl implements ContactService {
    @Resource
    private ContactMapper contactMapper;
    @Override
    public List<Contact> findAll() {
        return contactMapper.findAll();
    }
}
