package com.springStudy;

public class Demo {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo(String name) {
        System.out.println("测试提交效果");
        this.name = name;
    }
}
