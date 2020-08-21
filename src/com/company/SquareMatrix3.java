package com.company;

import java.util.Scanner;

public class SquareMatrix3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;


            int counter = (int) Math.pow(2, N - 1);
            int length = (int) Math.pow(counter, 2);

            for (int i = 1; i <= counter; i = i + i) {
                for (int j = i; j <= counter*i; j+=j) {
                    System.out.printf("%" + (String.valueOf(length).length()) + "d", j);
                    if (counter*i != j) System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();


        }

    }
}
