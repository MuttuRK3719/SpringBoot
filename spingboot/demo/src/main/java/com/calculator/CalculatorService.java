package com.calculator;

public interface CalculatorService<T> {
    public T add(T a, T b);

    public T substract(T a, T b);

    public T multiply(T a, T b);

    public Double divide(T a, T b);

    public T modulus(T a, T b);
}
