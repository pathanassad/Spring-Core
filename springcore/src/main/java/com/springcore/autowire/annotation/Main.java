package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

public static void main(String[] args)
{
    ApplicationContext context = new ClassPathXmlApplicationContext("autowire_annotation.xml");
    Admin admin = (Admin) context.getBean("admin");
    System.out.println(admin);
}
}
