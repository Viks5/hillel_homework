package com.hillel.klysenko.lesson6;

public class Homework7 {
    public static void main(String[] args) {
        int sequenceNumber = 1;
        int shatlleNumber = 1;
        while (sequenceNumber <= 100) {
            if (check(shatlleNumber)) {
                System.out.println("Sequence number is: " + sequenceNumber +
                        ", shattle number is: " + shatlleNumber);
                sequenceNumber++;
            }
            shatlleNumber++;
        }
    }
        static boolean check(int unluckyNumber) {
        if ((unluckyNumber == 4) || (unluckyNumber == 9) ||
                (unluckyNumber % 10 == 4) || (unluckyNumber % 10 == 9) ||
                ((unluckyNumber % 100) /10 == 4) || ((unluckyNumber % 100) /10 == 9)) {
            return false;
            } else {
            return true;
        }
      }
}
