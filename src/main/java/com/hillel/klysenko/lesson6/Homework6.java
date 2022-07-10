package com.hillel.klysenko.lesson6;

import java.util.Scanner;

    public class Homework6 {
        public static void main(String[] args) {
            int a = (int) (Math.random() * 11);
            System.out.println(a);
            Scanner scanner = new Scanner(System.in);
            int tryNumber = 1;
            while (tryNumber <= 3) {
                System.out.println("Угадайте число, попытка №: " + tryNumber);
                int b = scanner.nextInt();
                tryNumber++;
                if (a == b) {
                    System.out.println("Поздравляем! Вы угадали!");
                    break;
                }
                if (tryNumber > 3) {
                    System.out.println("Попыток больше нет. Вы не угадали");
                    break;
                }
            }
            scanner.close();
        }
    }

