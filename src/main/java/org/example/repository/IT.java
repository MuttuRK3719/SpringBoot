package org.example.repository;

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
