package com.anhtester.objectclass;

public class Employee {

    //Thành phần của lớp
    String name = "Phạm Thị Hiền";
    String birthday;
    int age = 35;
    String address = "Hà nội";

    //Khối lệnh dạng block
    //Chạy đầu tiên trong class
    //Tự động chạy trước khi truy cập class này
    static {
        System.out.println("Hien QC");
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public static void main(String[] args) {

        //Khai báo class và object
        Employee employee1 = new Employee();
        System.out.println(employee1.getName());

        Employee employee2= new Employee();
        System.out.println(employee2.age + " tuổi");
        System.out.println("Đến từ: "+ employee2.getAddress());

    }
}
