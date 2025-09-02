package org.example.configur;

import org.example.repository.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Employee getEmployee(){
        return  new Employee();
    }
    @Bean
    public Employee getEmployee1(){
        return  new Employee();
    }

}
