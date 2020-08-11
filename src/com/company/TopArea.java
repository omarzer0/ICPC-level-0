package com.company;

import java.util.Scanner;

public class TopArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);

        double M[][] = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double output = 0;
        int c = 10;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j <= c; j++) {
                output += M[i][j];
            }
            c--;
        }


        switch (operation) {
            case 'S':
                System.out.printf("%.1f\n",output);
                break;
            case 'M':
                System.out.printf("%.1f\n", output / 30);
                break;
        }


    }
}
