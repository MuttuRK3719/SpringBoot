package org.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Finance implements Departments {

    private Person person;
    @Autowired
    public Finance(@Qualifier("employee2")Person person) {
        this.person = person;
        System.out.println("Finance Constructor is created");
    }

    @Override
    public String departmentName() {
        return person.getDeptName();
    }
}
