package com.springcore.collection;
import java.util.*;

public class Employee
{
    private String name;
    private List<String> phoneNumbers;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties props;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Employee(String name, List<String> phoneNumbers, Map<String, String> courses, Set<String> addresses) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        this.courses = courses;
        this.addresses = addresses;
    }
    public Employee()
    {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", addresses=" + addresses +
                ", courses=" + courses +
                ", props=" + props +
                '}';
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}