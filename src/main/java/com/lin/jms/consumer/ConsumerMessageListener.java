package com.lin.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/8/30 16:04
 * @Description:
 */
public class ConsumerMessageListener implements MessageListener {
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("接收消息" +textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
