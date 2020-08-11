package com.company;

import java.util.Scanner;

public class HoursAndMinutes {
    public static void main(String[] args) {


        int h1, h2, m1, m2, hoursSum, minSum;
        Scanner sc = new Scanner(System.in);
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();

        if (h1 >= h2) {
            h2 = h2 + 24;
        }
        hoursSum = h2 - h1;

        minSum = m2 - m1;
        if (minSum < 0) {
            int hoursInMinutes = (hoursSum * 60) + minSum;
            hoursSum = hoursInMinutes / 60;
            minSum = hoursInMinutes % 60;
        }

        if (hoursSum == 24 && minSum > 0) {
            hoursSum = 0;
        }

        System.out.println("O JOGO DUROU " + hoursSum + " HORA(S) E " + minSum + " MINUTO(S)");


    }
}
