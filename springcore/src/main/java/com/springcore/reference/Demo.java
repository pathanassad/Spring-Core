package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getAddress());

    }
}
