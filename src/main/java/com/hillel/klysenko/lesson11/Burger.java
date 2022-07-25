package com.hillel.klysenko.lesson11;

public class Burger {

    String bup;
    String numberOfMeat;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    public Burger(String bup, String meat,
                  String cheese, String greens, String mayonnaise) {
        this.bup = bup;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
            System.out.println("Standard burger consist of: " + bup + ", " + meat + ", "
                + cheese + ", " + greens + ", " + mayonnaise);
    }
    public Burger(String bup, String meat,
                  String cheese, String greens) {
        this.bup = bup;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Dietary burger consist of: " + bup + ", " + meat + ", "
                + cheese + ", " + greens +  " (without mayonnaise)");
    }
    public Burger(String bup, String numberOfMeat, String meat,
                  String cheese, String greens, String mayonnaise) {
        this.bup = bup;
        this.numberOfMeat = numberOfMeat;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Burger with double meat consist of: " + bup + ", " + numberOfMeat + " " + meat + ", "
                + cheese + ", " + greens +  ", " + mayonnaise);
    }
}
