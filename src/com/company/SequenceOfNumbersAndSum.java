package com.company;

import java.util.Scanner;

public class SequenceOfNumbersAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean stillRunning = true;

        while (stillRunning) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            int a = Math.min(m, n);
            int b = Math.max(m, n);

            int sum = 0;
            if (a <= 0 || b <=  0) break;

            for (int i = a; i <= b; i++) {
                sum += i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + sum);
        }


    }
}
