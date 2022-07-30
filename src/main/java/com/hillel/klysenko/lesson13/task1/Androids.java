package com.hillel.klysenko.lesson13.task1;

public class Androids implements Smartphones, LinuxOS {

    @Override
    public void call() {
        System.out.println("android calling");
    }

    @Override
    public void sms() {
        System.out.println("android sending sms");
    }

    @Override
    public void internet() {
        System.out.println("android connecting internet");
    }

    @Override
    public void linuxOS() {
        System.out.println("this smartphone have LinuxOS");
    }
}
