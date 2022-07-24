package com.hillel.klysenko.lesson11;

public class Burger {
    String bup;
    String meat;
    String secondMeat;
    String cheese;
    String greens;
    String mayonnaise;
    public Burger(String bup, String meat,
                  String cheese, String greens, String mayonnaise) {
            System.out.println("Standard burger consist of: " + bup + ", " + meat + ", "
                + cheese + ", " + greens + ", " + mayonnaise);
    }
    public Burger(String bup, String meat,
                  String cheese, String greens) {
        System.out.println("Dietary burger consist of: " + bup + ", " + meat + ", "
                + cheese + ", " + greens +  " (without mayonnaise)");
    }
    public Burger(String bup, String meat, String secondMeat,
                  String cheese, String greens, String mayonnaise) {
        System.out.println("Burger with double meat consist of: " + bup + ", " + meat + ", "+ secondMeat + ", "
                + cheese + ", " + greens +  ", " + mayonnaise);
    }
}
