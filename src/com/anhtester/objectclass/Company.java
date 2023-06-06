package com.anhtester.objectclass;

public class Company {
    public static void main(String[] args) {

        //C1:Truy xuất đối tượng chình thống
        Employee employee = new Employee();
        System.out.println(employee.getName());

        //C2:Truy xuất Đối tượng Annoymous-Vô danh-Không có tên đối tượng
        new Employee().getName();
        new Employee().getAddress();

    }

}
