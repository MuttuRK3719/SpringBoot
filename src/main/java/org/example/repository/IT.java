package org.example.repository;

import org.springframework.stereotype.Component;

@Component
public class IT implements Departments {
    private Employee employee;

    public IT(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String departmentName() {
        return employee.getDeptName();
    }
}
