package com.example.queue.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

/**
 * @author clz
 * @data 2019/11/7 13:53
 * @description
 */
@Configuration
public class RabbitMqConf {
    @Bean
    public Queue queue(){
        return new Queue("hello");
    }
}
