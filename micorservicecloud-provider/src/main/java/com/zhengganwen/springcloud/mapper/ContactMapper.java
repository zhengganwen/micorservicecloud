package com.zhengganwen.springcloud.mapper;
import com.zhengganwen.springcloud.entity.Contact;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description
 * @author:Mr.Zheng
 * @Date:
 */
@Mapper
public interface ContactMapper {
    /**
     * 查询所有的
     * @return List<Contact>
     */
    List<Contact>   findAll();

}
