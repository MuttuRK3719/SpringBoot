package org.example.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Employee {
    private String deptName;

    public Employee(@Value("IT") String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void greeting() {
        System.out.println("Good morning");
    }
}
