package com.springStudy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        /*bean 与 bean 之间的引用 */
        ApplicationContext axt = new ClassPathXmlApplicationContext("beans.xml");
        Persons person = (Persons) axt.getBean("person7");
        List<Car> cars = person.getCars();
        for (Car car :cars) {
            System.out.println(car);
        }
    }
}