package com.example.rebbitservice;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue()
    {
        return new Queue("hello");
    }

    @Bean
    public  Queue queueMessage()
    {
        return  new Queue("top_message");
    }

    @Bean
    public Queue queueMessages()
    {
        return  new Queue("top_messages");
    }

    @Bean
    public TopicExchange exchange()
    {
        return  new TopicExchange("exchange");
    }

    /**
     * Direct 交换机绑定
     * */
    @Bean
    public Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange)
    {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic_message");
    }

    @Bean
    public Binding bindingExchangeMessages(Queue queueMessages,TopicExchange exchange)
    {
        return  BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }


}
