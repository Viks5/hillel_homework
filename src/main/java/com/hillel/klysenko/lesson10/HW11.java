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
                System.out.print(array[i][j] + " \t");
                array2[j][i] = array[i][j];
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
        System.out.println("Please, enter some integer number");
        while (true) {
            int n = 0;
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    return n;
                } else {
                    System.out.println("Please, enter some integer number from 0. Try again");
                }
            } else {
                System.out.println("You entered an invalid value. Please, enter some integer number");
                scanner.next();
            }
        }
    }

}
