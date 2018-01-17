package com.springStudy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext axt = new ClassPathXmlApplicationContext("beans.xml");

    }
}