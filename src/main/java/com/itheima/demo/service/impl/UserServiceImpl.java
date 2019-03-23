package com.itheima.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.demo.service.UserService;

/**
 * @Author mazhipeng
 * @create 2019/3/23 14:31
 */
@Service
public class UserServiceImpl<fori, array> implements UserService {

    public static void main(String[] args) {
        System.out.println();
    }
    @Override
    public String getName() {
        return "itheima";
    }

    @Override
    public String getName1() {
        return null;
    }

    @Override
    public String getName2() {
        return null;
    }




}
