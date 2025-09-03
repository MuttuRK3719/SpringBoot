package org.example.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Employee implements Person {
    private String deptName;

    public Employee(@Value("IT") String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String getDeptName() {
        return deptName;
    }

    public void greeting() {
        System.out.println("Good morning");
    }
}
