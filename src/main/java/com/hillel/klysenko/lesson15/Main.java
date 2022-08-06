//package com.hillel.klysenko.lesson15;
//
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        run();
//        System.out.println("Вы заказали: " + Order.count + "напитка" + "общая сумма к оплате: " + "гривен");
//    }
//
//    private static void run() {
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Введите название напитка");
//            String value = scanner.nextLine();
//            Drinks drinks = null;
//            if (value.equals("no")) {
//                break;
//            } else {
//                drinks = drinks.valueOf(value.toUpperCase(Locale.ROOT));
//            }
//
//            boolean ok = false;
//            switch (drinks) {
//                case COFFE:
//                    System.out.println(
//                            "Вы заказали " + Drinks.COFFE
//                                    + " стоимость " + drinks.getPrice() + "гривен");
////                        ok = checkYears(drinks);
//                    break;
//                case TEA:
//                    System.out.println(
//                            "Вы заказали " + Drinks.TEA
//                                    + " стоимость " + drinks.getPrice() + "гривен");
////                        ok = checkYears(drinks);
//                    break;
//                case LEMONADE:
//                    System.out.println(
//                            "Вы заказали " + Drinks.LEMONADE
//                                    + " стоимость " + drinks.getPrice() + "гривен");
////                        ok = checkYears(drinks);
//                    break;
//                case MOJITO:
//                    System.out.println(
//                            "Вы заказали " + Drinks.MOJITO
//                                    + " стоимость " + drinks.getPrice() + "гривен");
////                        ok = checkYears(drinks);
//                    break;
//                case MINERAL_WATER:
//                    System.out.println(
//                            "Вы заказали " + Drinks.MINERAL_WATER
//                                    + " стоимость " + drinks.getPrice() + "гривен");
////                        ok = checkYears(drinks);
//                    break;
//                case COCA_COLA:
//                    System.out.println(
//                            "Вы заказали " + Drinks.COCA_COLA
//                                    + " стоимость " + drinks.getPrice() + "гривен");
////                        ok = checkYears(drinks);
//                    break;
//            }
//        }
//    }

