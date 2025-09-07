package com.greetingapplication;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Kannada")
public class KannadaGreeting implements Greeting {
    public KannadaGreeting() {
        System.out.println("Kannada constructor");
    }

    @Override
    public void greeting() {
        System.out.println("ಶುಭಾಶಯ");
    }
}
