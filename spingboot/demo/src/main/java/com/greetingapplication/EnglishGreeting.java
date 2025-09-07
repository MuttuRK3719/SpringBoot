package com.greetingapplication;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("English")
public class EnglishGreeting implements Greeting {
    public EnglishGreeting() {
        System.out.println("English constructor");

    }

    @Override
    public void greeting() {
        System.out.println("Hey good morning");
    }
}
