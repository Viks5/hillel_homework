package com.hillel.klysenko.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int VALUE = 100;
        int a = getNumber(scanner);
        int b = getNumber(scanner);
        int[][] array = new int[a][b];
        int[][] array2 = new int[b][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * VALUE);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " \t");
                }
                System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " \t");
            }
            System.out.println();
        }
        scanner.close();
    }
    static int getNumber(Scanner scanner) {
        System.out.println("Please enter some value");
        while (true) {
            int n = 0;
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    return n;
                } else {
                    System.out.println("Please enter some value from 0. Try again");
                    n--;
                    continue;
                }

            } else {
                System.out.println("Please enter some value");
                scanner.next();
            }
        }
    }

}
