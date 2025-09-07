package com.calculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("message.properties")
@Component
public class CalculatorImp implements CalculatorService<Integer> {
    @Value("${a}")
    Integer a;
    @Value("${b}")
    Integer b;
    @Override
    public Integer add(Integer a, Integer b) {
        return this.a+a + b;
    }

    @Override
    public Integer substract(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Double divide(Integer a, Integer b) {
        return (double) a / b;
    }

    @Override
    public Integer modulus(Integer a, Integer b) {
        return a % b;
    }
}
