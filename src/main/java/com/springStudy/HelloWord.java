package com.springStudy;

public class HelloWord {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("从配置文件得到名字是："+name);
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello:"+name);
    }

    public HelloWord() {
        System.out.println("这是一个无参构造方法 ");
    }
}
