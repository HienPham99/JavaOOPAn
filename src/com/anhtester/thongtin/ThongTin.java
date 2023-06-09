package com.anhtester.thongtin;

import com.anhtester.phamvitruycap.Student;

public class ThongTin extends Student {
    public void getInfo(){
        System.out.println(getName());
        System.out.println(getCCCD());
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.getInfoStudent();

        ThongTin thongtin = new ThongTin();
        thongtin.getInfo();

    }

}
