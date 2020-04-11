package com.avpines.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.function.Supplier;

@Configuration
public class MessageProducer {

    private Random rnd = new Random();

    private String[] quotes = {
            "Before software can be reusable it first has to be usable",
            "One man’s crappy software is another man’s full-time job",
            "Deleted code is debugged code",
            "If at first you don’t succeed; call it version 1.0",
            "It’s not a bug – it’s an undocumented feature"
    };

    @Bean
    Supplier<String> produce() {
        return () -> {
            String msg = quotes[rnd.nextInt(quotes.length)];
            System.out.println("Producing message: " + msg);
            return msg;
        };
    }

}

