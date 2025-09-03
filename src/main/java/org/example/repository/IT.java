package org.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IT implements Departments {
    private Person employee;
    @Autowired
    public IT(Person employee) {
        this.employee = employee;
        System.out.println("IT  Constructor is created");

    }

    @Override
    public String departmentName() {
        return employee.getDeptName();
    }
}
