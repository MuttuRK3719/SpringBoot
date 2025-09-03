package org.example.service;

import org.example.repository.Departments;
import org.example.repository.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.repository")
public class Method1 {
    public static void main(String[] args) {
        //the bean is created when we call application context
        ApplicationContext context = new AnnotationConfigApplicationContext(Method1.class);
//        Employee employee=context.getBean(Employee.class);
//        employee.greeting();
        //by using method name
//        Employee employee1=(Employee) context.getBean("getEmployee1");
        Employee employee1 = context.getBean(Employee.class);
        employee1.greeting();
        Departments dept=context.getBean(Departments.class);
        System.out.println(dept.departmentName());
    }
}
