package com.company;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > h) result += 2;
            else result++;
        }

        System.out.println(result);

    }
}
