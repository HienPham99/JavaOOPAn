package com.anhtester.objectclass;

public class Employee {

    //Thành phần của lớp
    String name = "Phạm Thị Hiền";
    String birthday;
    int age;
    String address = "Hà nội";

    //Khối lệnh dạng block
    //Chạy đầu tiên trong class
    //Tự động chạy trước khi truy cập class này
    static {
        System.out.println("Load config");
    }

    //Hàm xây dựng không tham so
    public Employee(){

    }

    public Employee(String name, String address){
        this.name = name;
        this.address = address;
    }

    //Khai báo hàm xây dựng có tham số
    public  Employee (String name, String birthday, int age, String address){
        this.name = name;
        this.birthday = birthday;
        this.age= age;
        this.address= address;
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
        System.out.println(employee1.getAddress());


        System.out.println("**********");

        //Khởi tạo đối tượng class với cấu trúc của hàm xây dựng KHÔNG có tham số
        Employee employee2= new Employee();
        System.out.println("Tên: " + employee2.getName());
        System.out.println(employee2.age + " tuổi");
        System.out.println("Đến từ: "+ employee2.getAddress());

        System.out.println("**********");

        //Khởi tạo đối tượng class với cấu trúc của hàm xây dựng CÓ tham số
        Employee employee3= new Employee("Hien", "Đông anh");
        System.out.println(employee3.getName());
        System.out.println(employee3.getAddress());
        System.out.println(employee3.age);
        System.out.println(employee3.birthday);

        System.out.println("**********");

        Employee employee4= new Employee("Châu", "06/08/2019", 4, "Đông anh - Hà nội");
        System.out.println(employee4.getName());
        System.out.println(employee4.birthday);
        System.out.println(employee4.age);
        System.out.println(employee4.getAddress());

        Employee employee5= new Employee("Giang", "06/08/2016", 7," Đông anh - hà nội");

    }
}
