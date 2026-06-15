package com.springcore.autowire;

import org.springframework.core.ResolvableType;

public class Employee {

    private Address address;
    private Result result;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Calling setter method");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }

    public Employee(Address address)
    {
        super();
        this.address = address;

    }

    public Employee() {
        super();
    }
}
