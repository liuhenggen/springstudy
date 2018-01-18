package com.springStudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext axt = new ClassPathXmlApplicationContext("beantest.xml");
        Study study = (Study) axt.getBean("study");
        System.err.println(study);
        ((ConfigurableApplicationContext)axt).close();

    }
}
