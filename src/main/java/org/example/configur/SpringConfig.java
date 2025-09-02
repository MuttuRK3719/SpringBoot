package org.example.configur;

import org.example.repository.Departments;
import org.example.repository.IT;
import org.example.repository.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Departments getEmployee() {
        //Constructor Injection
        return new IT(getEmployee1());
    }

    @Bean("getEmp")
    public Employee getEmployee1() {
        return new Employee("IT");
    }

}
