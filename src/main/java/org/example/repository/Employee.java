package org.example.repository;

public class Employee {
    private String deptName;

    public Employee(String deptName) {
        this.deptName = deptName;
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
