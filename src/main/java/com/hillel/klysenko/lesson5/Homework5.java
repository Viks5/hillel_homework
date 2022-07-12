package com.hillel.klysenko.lesson5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Пожалуйста, введите имя команды №1:");
        String nameTeam1 = scanner.nextLine();
        System.out.println(nameTeam1);

        System.out.println("Пожалуйста, введите количество фрагов участников команды: "
                + nameTeam1);
        int player1Team1 = points();
        int player2Team1 = points();
        int player3Team1 = points();
        int player4Team1 = points();
        int player5Team1 = points();

        System.out.println("Пожалуйста, введите имя команды №2:");
        String nameTeam2 = scanner.nextLine();
        System.out.println(nameTeam2);

        System.out.println("Пожалуйста, введите количество фрагов участников команды: "
                + nameTeam2);
        int player1Team2 = points();
        int player2Team2 = points();
        int player3Team2 = points();
        int player4Team2 = points();
        int player5Team2 = points();
        double arithmeticMeanTeam1 = arithmeticMean(player1Team1, player2Team1,
                player3Team1, player4Team1, player5Team1, nameTeam1);
        double arithmeticMeanTeam2 = arithmeticMean(player1Team2, player2Team2,
                player3Team2, player4Team2, player5Team2, nameTeam2);

        if (arithmeticMeanTeam1 > arithmeticMeanTeam2) {
            System.out.println("Победила команда " + nameTeam1 + " набравшая"
                    + " " + arithmeticMeanTeam1 + " очков");
        } else if (arithmeticMeanTeam1 < arithmeticMeanTeam2) {
            System.out.println("Победила команда " + nameTeam2 + " набравшая "
                    + arithmeticMeanTeam2 + " очков");
        }
        else {
            System.out.println("Ничья");
        }
        scanner.close();
        }

    static int points() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int teamPlayer = scanner.nextInt();
            System.out.println(teamPlayer);
            return teamPlayer;
        } else {
            System.out.println("Wrong data");
            System.exit(0);
            scanner.next();
            return -1;
        }
    }

    static double arithmeticMean(int a, int b, int c, int d, int e, String f) {
        double rez = (double) (a + b + c + d + e) / 5;
        System.out.println("Среднее арифметическое команды " + f + ": " + rez);
        return rez;
    }
}

