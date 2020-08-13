package com.company;

import java.util.Scanner;

public class BeatTheSpread {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            if ((s >= d) && (s + d) % 2 == 0) {
                int a = (s + d) / 2;
                int b = a - d;
                System.out.println(a + " " + b);

            } else {
                System.out.println("impossible");
            }

        }

    }

}
