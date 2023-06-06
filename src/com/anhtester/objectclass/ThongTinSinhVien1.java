package com.anhtester.objectclass;

import java.util.ArrayList;

public class ThongTinSinhVien1 {
    public static void main(String[] args) {

        //Ý nghĩa hàm xây dựng: luôn trùng tên với class + được phép truyền giá trị trực tiếp thông qua cac biến(truyền bộ data) 
        //Khởi tạo 3 đối tượng sinh viên với 3 bộ dữ liệu khác nhau
        SinhVien1 sv1 = new SinhVien1("Pham Thi Hien", 32, "Nữ", "Hà Nội");
        SinhVien1 sv2 = new SinhVien1("Pham Van Hai", 33, "Nam", "Hà Tây");
        SinhVien1 sv3 = new SinhVien1("Pham Minh chau", 6, "nam", "Thanh Hóa");

        //Thêm 3 đối tượng vào trong ArrayList để lưu trữ
        ArrayList<SinhVien1> sinhvienArrayList = new ArrayList<>();
        sinhvienArrayList.add(sv1);
        sinhvienArrayList.add(sv2);
        sinhvienArrayList.add(sv3);

        //Duyệt ArrayList để lấy ra thông tin của từng sinh viên
        for (SinhVien1 sv:sinhvienArrayList){
            System.out.println("__________________");
            System.out.println(sv.getName());
            System.out.println(sv.getAge());
            System.out.println(sv.getGender());
            System.out.println(sv.getAddress());


        }
    }

}
