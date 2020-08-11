package com.company;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isLast = true;

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) System.out.print("#");
                else {
                    if (isLast && j == m - 1) {
                        System.out.print("#");
                    } else if (!isLast && j == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                isLast = !isLast;
            }
            System.out.println();
        }
    }
}
