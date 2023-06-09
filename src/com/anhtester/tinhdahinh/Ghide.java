package com.anhtester.tinhdahinh;

public class Ghide extends ActionKeyword {

    @Override //từ khóa nhận biết hàm ghi đè của class con ghi dè hàm class cha.
    public void clickElement() {
        System.out.println("Click on element from Child class");
    }

    @Override
    public void setText(String text) {
        System.out.println("SetText from Child class");
    }

    public void scrollToElement(){
        System.out.println("Scroll to element from Child class");
    }

    public static void main(String[] args) {
        Ghide ghiDe = new Ghide();
        ghiDe.clickElement();
        ghiDe.setText("Selenium");
        ghiDe.scrollToElement();
    }
}
