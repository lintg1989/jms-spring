package com.lin.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/8/30 16:10
 * @Description:
 */
public class AppConsumer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");


    }
}
