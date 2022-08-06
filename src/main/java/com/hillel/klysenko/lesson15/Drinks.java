package com.hillel.klysenko.lesson15;

public enum Drinks {

    COFFE(50),
    TEA(35),
    LEMONADE(55),
    MOJITO(80),
    MINERAL_WATER(25.5),
    COCA_COLA(40);

    private double price;
    Drinks(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;

    }
}
