package com.hillel.klysenko.lesson13.task1;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        IPhones iPhone = new IPhones();
        android.linuxOS();
        android.call();
        android.sms();
        android.internet();
        System.out.println();
        iPhone.iOS();
        iPhone.internet();
        iPhone.call();
        iPhone.sms();



    }
}
