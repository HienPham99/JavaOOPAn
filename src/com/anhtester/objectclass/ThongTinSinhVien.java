package com.anhtester.objectclass;

public class ThongTinSinhVien {
    public static void main(String[] args) {

        //Khai báo đối tượng class đ truy xuất thông tin trong một class
        SinhVien sv1 = new SinhVien(); //Tương ứng hàm xây dựng không c tham số

        //Gọi thành phần trong class thông qua đối tượng
        System.out.println(sv1.getName());
        System.out.println(sv1.getClassName());
        System.out.println(sv1.getAge());
        System.out.println(sv1.getAddress());

        //Khởi tạo đối tươợng cho class SinhVien nhưng với cấu trúc hàm xây dựng có tham số
        SinhVien sv2 = new SinhVien("Hiền", 33, "Hà nội", "AutomationTest");
        System.out.println("+++++++++++++");
        System.out.println(sv2.getName());
        System.out.println(sv2.getAge());
        System.out.println(sv2.getAddress());
        System.out.println(sv2.getClassName());
    }
}
