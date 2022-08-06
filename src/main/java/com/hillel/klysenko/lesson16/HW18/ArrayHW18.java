package com.hillel.klysenko.lesson16.HW18;

public class ArrayHW18 {

    public static Integer getNumber(int[] array, double value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static boolean checkIsSorted(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

