package com.greetingapplication;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Hindi")
public class HindiGreeting implements Greeting {
    @Override
    public void greeting() {
        System.out.println("नमस्ते");
    }

    public HindiGreeting() {
        System.out.println("Hindi constructor");

    }
}
