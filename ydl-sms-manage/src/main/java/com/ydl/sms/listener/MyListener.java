package com.ydl.sms.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

//普通类--》reids监听类
/*@Component
@Slf4j
public class MyListener implements MessageListener {

    //接受到redis消息时，干的事儿
    @Override
    public void onMessage(Message message, byte[] bytes) {
        log.info("接收到了消息：{}",message);
    }
}*/
@Slf4j
@Component
public class MyListener implements MessageListener{
    @Override
    public void onMessage(Message message, byte[] bytes) {

        try {
            log.info("我收到了消息1111111,{}",new String(message.getBody(),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        log.info("我收到了消息22222,{}",message);
        log.info("hahahahahah");
    }
}
