package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("standalone_collections.xml");
        Person person1 = (Person) context.getBean("person1");
        Guests guests = (Guests) context.getBean("guest1");
        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());
        System.out.println(person1.getFeeStructure().getClass());
        System.out.println(person1.getFeeStructure().getClass().getName());
        System.out.println(guests);
        System.out.println(guests.getGuests().getClass().getName());

    }
}
