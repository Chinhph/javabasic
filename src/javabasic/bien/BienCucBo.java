package javabasic.bien;

public class BienCucBo {
    public void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {

        String name = "TIMKEM";         //Biến cục bộ

        BienCucBo bienLocal = new BienCucBo();

        bienLocal.sayHello();

    }
}
