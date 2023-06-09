package com.anhtester.tinhkethua;

public class Student extends Person{

    public Student(String name, int age, float hight) {
        super(name, age, hight);

    }
//    public void layThongtin() {
//        getInfor();
//    }

    public static void main(String[] args) {
       Student student = new Student("Hiền", 32, 163.0f);
       student.getInfor();

    }
}



