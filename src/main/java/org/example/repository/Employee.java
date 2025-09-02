package org.example.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Employee {
    private String deptName;

    public Employee() {
        this.deptName = "IT";
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void greeting() {
        System.out.println("Good morning");
    }
}
