package com.lin.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/8/30 15:28
 * @Description:
 */
public class AppProducer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i=0; i<100; i++) {
            service.sendMessage("test" + i);
        }
        context.close();
    }

}
