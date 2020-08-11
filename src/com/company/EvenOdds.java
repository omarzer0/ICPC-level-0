package com.company;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long helper = 0;
        long result = 0;

        if (n % 2 == 0)
            helper = n / 2;
        else
            helper = (n + 1) / 2;


        if (k > helper) {
            result = (2 * (k - helper));
        } else {
            result = 1 + (2 * (k - 1));
        }

        System.out.println(result);
    }
}