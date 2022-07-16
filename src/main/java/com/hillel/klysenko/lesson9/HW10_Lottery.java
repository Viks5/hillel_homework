package com.hillel.klysenko.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class HW10_Lottery {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;
        int lenhgt = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number from 0 to 9");
        int[] lotteryCompanyArray = new int[lenhgt];
        int[] playerArray = new int[lenhgt];
        while (true) {
            for (int i = 0; i < lotteryCompanyArray.length; i++) {
                lotteryCompanyArray[i] = (int) (Math.random() * 10);
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n < 10) {
                        playerArray[i] = n;
                    } else {
                        System.out.println("Please enter any number from 0 to 9. Try again");
                        i--;
                        continue;
                    }
                } else {
                    System.out.println("Wrong data. Please enter any number from 0 to 9. Try again");
                    i--;
                    scanner.next();
                }
            }
            scanner.close();
            System.out.println("The numbers specified by lottery's Company: " + Arrays.toString(lotteryCompanyArray));
            System.out.println("The numbers specified by player: " + Arrays.toString(playerArray));
            Arrays.sort(lotteryCompanyArray);
            System.out.println("Sorted numbers specified by lottery's Company: " + Arrays.toString(lotteryCompanyArray));
            Arrays.sort(playerArray);
            System.out.println("Sorted numbers specified by player:            " + Arrays.toString(playerArray));
            for (int j = 0; j < playerArray.length; j++) {
                if (playerArray[j] == lotteryCompanyArray[j]) {
                    count++;
                }
            }
            System.out.println("Number of matches: " + count);
            System.exit(0);
        }
    }
}
