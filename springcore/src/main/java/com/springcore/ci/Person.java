package com.springcore.ci;
import java.util.List;

public class Person
{
    private String name;
    private int id;
    private Certificate certificate;
    private List<String> phoneNumbers;
    public Person(String name, int id, Certificate certificate, List<String> phoneNumbers)
    {
        this.name = name;
        this.id = id;
        this.certificate = certificate;
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", certificate=" + certificate +
                ", phone Numbers=" + phoneNumbers +
                '}';
    }
}
