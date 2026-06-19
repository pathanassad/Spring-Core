package com.springcore.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
        System.out.println(employee1.getName());
        System.out.println(employee1.getPhoneNumbers());
        System.out.println(employee1.getAddresses());
        System.out.println(employee1.getCourses());
        System.out.println(employee1.getProps());
        System.out.println(employee1.getPhoneNumbers().getClass().getName());

    }
}