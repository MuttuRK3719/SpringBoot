package org.example.service;

import org.example.configur.SpringConfig;
import org.example.repository.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Method1 {
    public static void main(String[] args) {
        //the bean is created when we call application context
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
//        Employee employee=context.getBean(Employee.class);
//        employee.greeting();
        //by using method name
//        Employee employee1=(Employee) context.getBean("getEmployee1");
        Employee employee1=context.getBean("getEmp",Employee.class);
        employee1.greeting();
    }
}
