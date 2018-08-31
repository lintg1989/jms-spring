package com.lin.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/8/30 15:15
 * @Description:
 */
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    JmsTemplate jmsTemplate;
//    @Resource(name = "queueDestination")
//    Destination destination;

    @Resource(name = "topicDestination")
    Destination destination;

    public void sendMessage(final String message) {
        //使用JmsTemplate发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            //创建一个消息
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);

                return textMessage;
            }
        });

        System.out.println("发送消息" + message);
    }
}
