package com.springStudy.annotation;

import java.lang.reflect.Method;

public class ParseAnn {

    public static void main(String[] args) {

        try {
            Class c = Class.forName("com.springStudy.annotation.son");
            boolean isExist = c.isAnnotationPresent(Desc.class);
            if (isExist){

                Desc desc = (Desc) c.getAnnotation(Desc.class);
                System.out.println(desc.value());
            }
            Method[] ms =  c.getMethods();
            for (Method method : ms){
                    boolean isMethod = method.isAnnotationPresent(Desc.class);
                    if (isMethod){
                        Desc desc = method.getAnnotation(Desc.class);
                        System.out.println(desc.value());
                    }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
