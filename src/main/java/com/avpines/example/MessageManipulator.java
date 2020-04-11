package com.avpines.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageManipulator {

    @Bean
    Function<String, String> uppercase() {
        return msg -> {
            String upper = msg.toUpperCase();
            System.out.println("Transforming message " + msg + " to " + upper);
            return upper;
        };
    }

}
