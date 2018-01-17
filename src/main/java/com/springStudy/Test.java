package com.springStudy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext axt = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) axt.getBean("person1");
        Car car = person.getCar();
        System.out.println(car);
    }
}