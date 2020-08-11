package com.company;

import java.util.Scanner;

public class LeftArea {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double output = 0;
        int h = 10;

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; i < 6 ? j < i : j < h; j++) {
                output += M[i][j];
            }
            h--;
        }

        if (operation == 'S') {
            System.out.printf("%.1f\n", output);
        } else if (operation == 'M') {
            System.out.printf("%.1f\n", output / 30);
        }


    }
}
