package com.hillel.klysenko.lesson11;

 public class BurgerMain {
    public static void main(String[] args) {
     Burger standardBurger = new Burger("bup", "beef", "mozzarella", "lettuce", "mayonnaise");
     Burger dietaryBurger = new Burger("bup", "chicken", "mozzarella", "lettuce");
     Burger doubleMeatBurger = new Burger("bup", "beef", "beef", "mozzarella", "lettuce", "mayonnaise");
 }
}
