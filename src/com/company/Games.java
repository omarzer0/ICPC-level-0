package com.company;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] homeArr = new int[n];
        int[] awayArr = new int[n];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            homeArr[i] = sc.nextInt();
            awayArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (homeArr[i] == awayArr[j]) counter++;
            }
        }

        System.out.println(counter);

    }
}
