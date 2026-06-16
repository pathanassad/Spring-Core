package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Admin {

private String name;
//@Autowired
private Employee employee;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Employee getEmployee() {
    return employee;
}

//@Autowired
public void setEmployee(Employee employee) {
    this.employee = employee;
    System.out.println("setting value of Employee");
}

@Override
public String toString() {
    return "Admin{" +
            "name='" + name + '\'' +
            ", employee=" + employee +
            '}';
}

@Autowired
public Admin(Employee employee)
{
    this.employee = employee;
    System.out.println("calling the constructor");
}
}
