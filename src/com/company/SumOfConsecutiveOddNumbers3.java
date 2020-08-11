package com.company;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt(); // start
            int Y = sc.nextInt(); // number of printed numbers

            if (X % 2 == 0) X++;
            int sum = 0;

            for (int j = 0; j < Y; j++) {
                sum += X;
                X += 2;
            }

            System.out.println(sum);
        }

    }
}
