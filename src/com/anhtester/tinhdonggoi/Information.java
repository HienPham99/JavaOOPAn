package com.anhtester.tinhdonggoi;

public class Information {

    public void TC01(){
        Student student = new Student("Hoàng", 32, "Sóc Trăng");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }

    public void TC02(){
        Student student = new Student("Hùng", 33, "Đà Nẵng");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }

    public static void main(String[] args) {
        Student student = new Student("Hien", 30, "Hà nội");
        System.out.println(student.getName());

        student.setName("Hân");
        System.out.println(student.getName());
        System.out.println("_++++++++++++++_");

        Information information = new Information();
        information.TC01();
        System.out.println("_++++++++++++++_");
        information.TC02();

    }
}
