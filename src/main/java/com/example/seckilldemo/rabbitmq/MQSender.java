package com.example.seckilldemo.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 消息发送者
 *
 * @author: p
 * @date 2022/5/7 7:42 下午
 * @ClassName: MQSender
 */
@Service
@Slf4j
public class MQSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void sendSeckillMessage(String message) {
        log.info("发送消息" + message);
        rabbitTemplate.convertAndSend("seckillExchange", "seckill.message", message);
    }




}
