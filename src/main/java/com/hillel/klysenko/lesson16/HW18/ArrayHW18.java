package com.hillel.klysenko.lesson16.HW18;

public class ArrayHW18 {
    public static void main(String[] args) {

        int[] array = {4, 8, 0};
        double value = 8;
       getNumber(array, value);
    }
        public static Integer getNumber (int[] array,  double value) {
        for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            return -1;
    }
    }


//    public static boolean CheckIsSquare(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            if (array.length != array[i].length) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void demoException() {
//        throw new IllegalArgumentException("MY ERROR!!!");
//    }
//        }

