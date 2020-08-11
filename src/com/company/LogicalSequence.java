package com.company;

import java.util.Scanner;

public class LogicalSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            System.out.println(i + " " + (i * i +1)  + " " + (i * i * i +1));
        }
    }
}
