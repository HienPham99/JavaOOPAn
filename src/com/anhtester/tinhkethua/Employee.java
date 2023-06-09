package com.anhtester.tinhkethua;

public class Employee extends Person{
    private  String address;
    public Employee(String name, int age, float hight, String address) {
        super(name, age, hight);

        this.address = address;
    }

    //Ghi đè phương thức từ class con đối với cha thông qua hàm sau
    public  void getInfo(){
        super.getInfor();
        System.out.println("Address: "+ address);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Châu" , 4, 110.0f, "Hà nội");
        employee.getInfor();
        System.out.println("Address: "+ employee.address);
    }
}
