package com.anhtester.objectclass;

public class Information {
    public static void main(String[] args) {
        Employee employee = new Employee("Hải", "Thanh Hóa");
        Employee employee2 = new Employee("Giang", "11/06/2019", 8,"Hà nô");

        System.out.println(employee.getName());
        System.out.println(employee2.getName());


    }

}
