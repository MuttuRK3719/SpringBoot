package com.greetingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class GreetingApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(GreetingApplication.class);
        Greeting greet=context.getBean(Greeting.class);
        greet.greeting();
    }
}
