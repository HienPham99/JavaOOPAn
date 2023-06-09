package com.anhtester.tinhdahinh;

public class NapChong {
    //Nap chồng là nhìu hàm (clickElement()) Xảy ra trên cùng 1 class và mang các tham số/già trị khác nhau

    public  void clickElement(){
        System.out.println("Clic Element");
    }

    public  void clickElement(String xpath) {
        System.out.println("Clic Element: " + xpath);
    }

    public  void clickElement(int id){
        System.out.println("Clic Element: "+ id);

    }

    public  void clickElement(String xpath, int timeout){
        System.out.println("Clic Element: " + xpath + "with timeout " + timeout);

    }

    public static void main(String[] args) {
        NapChong napChong = new NapChong();
        napChong.clickElement("//div");
        napChong.clickElement("//div ", 18);
    }
}
