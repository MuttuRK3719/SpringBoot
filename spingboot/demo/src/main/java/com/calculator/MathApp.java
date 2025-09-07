package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MathApp implements CommandLineRunner {
    @Autowired
    CalculatorService<Integer> service;
    public static void main(String[] args) {
        SpringApplication.run(MathApp.class);
    }

    @Override
    public void run(String... args) throws Exception {
        int a=service.substract(10,20);
        System.out.println(a);
    }

}
