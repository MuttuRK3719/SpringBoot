package org.example.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee2 implements Person{
    private  String deptName;
    public  Employee2(@Value("Finance") String deptName){
        this.deptName=deptName;
    }
    @Override
    public String getDeptName() {
        return deptName;
    }
}
