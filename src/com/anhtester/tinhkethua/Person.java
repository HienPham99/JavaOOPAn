package com.anhtester.tinhkethua;

public class Person {
    public String name;
    public int age;
    public float hight;

    public Person(String name, int age, float hight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
    }

    public void getInfor(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hight: " + hight);
    }
}
