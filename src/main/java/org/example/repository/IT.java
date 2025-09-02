package org.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IT implements Departments {
    private Employee employee;
    @Autowired
    public IT(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String departmentName() {
        return employee.getDeptName();
    }
}
