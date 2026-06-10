package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main
{
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        Samosa samosa = (Samosa) context.getBean("samosa");
        System.out.println(samosa);

        System.out.println("-----------------------------");
        Pepsi pepsi = (Pepsi) context.getBean("pepsi");
        System.out.println(pepsi);

        Person person = (Person) context.getBean("person");
        System.out.println(person);
        context.registerShutdownHook();


    }
}
