package com.william.service.impl;

import com.william.service.IAccountService;

import java.util.Date;


/**
 * 模拟业务层的实现
 */
public class AccountServiceImpl implements IAccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    //private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了"+name+","+age+","+birthday);
    }

}
