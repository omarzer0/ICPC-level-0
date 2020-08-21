package com.company;

import java.util.Scanner;

public class AboveTheSecundaryDiagonal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double sum = 0;
        int divider = 0;
        int stopCounter = 11;

        for (int i = 0; i < 11 ; i++) {
            for (int j = 0; j < stopCounter ; j++) {
                sum += M[i][j];
                divider++;
            }
            stopCounter--;
        }



        switch (operation) {
            case 'S':
                System.out.printf("%.1f\n", sum);
                break;
            case 'M':
                System.out.printf("%.1f\n", (sum / divider));
                break;
        }



    }
}
