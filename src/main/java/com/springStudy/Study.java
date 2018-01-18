package com.springStudy;

public class Study {

    private String name;
    private int age ;


    public Study() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("初始化名字是："+name);
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Study(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initMethod(){
        System.out.println("初始化成功");

    }


    @Override
    public String toString() {
        return "Study{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void destoryMethod(){
        System.out.println("销毁成功");
    }
}
