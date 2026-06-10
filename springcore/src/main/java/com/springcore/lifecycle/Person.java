package com.springcore.lifecycle;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class Person {

    private String name;

public String getName() {
    return name;
}

public void setName(String name) {
    System.out.println("Setting Person's Name");
    this.name = name;
}

@Override
public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            '}';
}

@PostConstruct
public void start()
{
    System.out.println("Init Method in Person");
}

@PreDestroy
public void end()
{
    System.out.println("Destroy Method in Person");
}
}
