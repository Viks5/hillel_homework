package com.hillel.klysenko.lesson8;

import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
//        task1();
        task2();
    }
    static void task1(){
        int [] array1 = new int [25];
        int [] array2 = new int [25];
        int team1 = 0;
        int team2 = 0;
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = 18 + (int)(Math.random() * (41-18));
           team1 += array1[i];
           result1 = team1 / array1.length;
        }
            System.out.println("The age of the players of the team №1 are: " + Arrays.toString(array1));
            System.out.println("The average age of team №1 is: " + result1);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = 18 + (int)(Math.random() * (41-18));
            team2 += array2[i];
            result2 = team2 / array2.length;
        }
        System.out.println("The age of the players of the team №2 are: " + Arrays.toString(array2));
        System.out.println("The average age of team №2 is: " + result2);
    }


    static void task2(){
        int [] source = {0, 1, 2, 4};
        int [] target = {7, 8, 9, 10, 12};
        int [] arrayCopy = new int[target.length + source.length];;
        for(int i = 0; i < arrayCopy.length; i++) {
            if (i < target.length) {
                arrayCopy[i] = target[i];
            } else {
                arrayCopy[i] = source[i - target.length];
            }
        }
        System.out.println(Arrays.toString(arrayCopy));
    }
}