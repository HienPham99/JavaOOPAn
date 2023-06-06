package com.anhtester.objectclass;

public class SinhVien1 {
    private String name;
    private int age;
    private String gender;
    private String address;

    ////Ý nghĩa hàm xây dựng: luôn trùng tên với class + được phép truyền giá trị trực tiếp thông qua cac biến(truyền bộ data)
    public SinhVien1(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public SinhVien1(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public SinhVien1() {

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
}
