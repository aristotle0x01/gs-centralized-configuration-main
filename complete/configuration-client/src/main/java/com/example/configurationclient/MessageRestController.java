package com.example.configurationclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MessageRestController {
    @Autowired
    private Config config;

    @Autowired
    private Config2 config2;

//    @Autowired
//    private Config3 config3;

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/message")
    String getMessage() {
        // 代理对象
        Config bean = context.getBean(Config.class);
        System.out.println("Class bean==========" + bean.getClass().getName());

        // 代理对象
        Object bean1 = context.getBean("config");
        System.out.println("name(config) bean==========" + bean1.getClass().getName());

        // 原类对象
        Object bean2 = context.getBean("scopedTarget.config");
        System.out.println("name(scopedTarget.config) bean==========" + bean2.getClass().getName());

        return config.getMessage() + " | " + config2.getKey1();
    }
}
