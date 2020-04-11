package com.avpines.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class MessageConsumer {

    @Bean
    Consumer<String> consume() {
        return msg -> {
            System.out.println("Consumed message " + msg);
        };
    }

}
