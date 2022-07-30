package com.hillel.klysenko.lesson13.task1;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();
        androids.linuxOS();
        androids.call();
        androids.sms();
        androids.internet();
        System.out.println();
        iPhones.iOS();
        iPhones.internet();
        iPhones.call();
        iPhones.sms();



    }
}
