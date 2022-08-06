package com.hillel.klysenko.lesson16.HW17;

public class ArrayUnitHW17 {
    public static double getAverageValue(int[][] array) {
        double sum = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                number++;
            }
        }
        return sum / number;
    }

    public static boolean CheckIsSquare(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false;
            }
        }
        return true;
    }
}