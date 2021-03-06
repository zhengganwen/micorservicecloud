package com.zhengganwen.springcloud.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 展示
 * @author Mr.Zheng
 * @Date 2017/09/18
 */

public class Contact implements Serializable {
    //id
    private String id;
    //绑定用户id
    private String  userid;
    //用户名字
    private String uname;
    //用户手机
    private String uphone;
    //用户地址
    private String relation;
    //初始化时间
    private Date intime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }
}
