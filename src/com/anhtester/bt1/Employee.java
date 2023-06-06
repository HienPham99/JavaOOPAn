package com.anhtester.bt1;

public class Employee {
    String name= "Phạm Thị Hiền";
    int age = 32;
    String address = "Đông anh,Hà nội";

    public static void main(String[] args) {
        Employee employee= new Employee();
        System.out.println("Họ Tên: " + employee.name);
        System.out.println("Tuổi: " + employee.age);
        System.out.println("Địa chỉ: "+ employee.address);
    }
}
