package com.william.ui;

import com.william.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    /**
     * 获取spring的ioc容器，并根据id创建对象
     *
     * @param args
     */
    public static void main(String[] args) {
        //IAccountService accountService = new AccountServiceImpl();

        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根绝id获取bean对象
        //IAccountService accountService = ac.getBean("accountService1", IAccountService.class);
        //IAccountService accountService = ac.getBean("accountService2", IAccountService.class);
        IAccountService accountService = ac.getBean("accountService3", IAccountService.class);
        accountService.saveAccount();

    }

}
