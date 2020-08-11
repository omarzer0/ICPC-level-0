package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int unSolvedCrime = 0;
        int hired = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0){
                hired ++;
            }else {
                if (hired == 0){
                    unSolvedCrime++;
                }else {
                    hired--;
                }
            }
        }

        System.out.println(unSolvedCrime);

    }
}
