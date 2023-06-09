package com.anhtester.phamvitruycap;

import java.util.ArrayList;

public class Student {

    //Private: Được truy cập trong Class
    private  String name="Hien";
    private int age = 32;
    private String CCCD = "123456789";

    //Protected:Được truy cập trong package
    protected String getName(){
        return name;
    }

    protected String getCCCD() {
        return CCCD;
    }

    //Default: không có từ khóa.Được truy cập trong package
    void printAge(){
        System.out.println("Age: " + age);
    }

    //Public: truy cập ở mọi nơi, trong package NGUỒN (src)
    public void getInfoStudent(){
        System.out.println("+++++++++++");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("CCCD: "+ CCCD);

    }

    public static void main(String[] args) {
        Student student = new Student();
        student.getInfoStudent();

    }

   }
