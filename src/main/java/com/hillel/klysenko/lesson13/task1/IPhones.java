package com.hillel.klysenko.lesson13.task1;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhone calling");
    }

    @Override
    public void sms() {
        System.out.println("iPhone sending sms");
    }

    @Override
    public void internet() {

        System.out.println("iPhone connecting internet");
    }

    @Override
    public void iOS() {
        System.out.println("this smartphone have iOS");
    }
}
