package com.company;

import java.util.Scanner;

public class Array123 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    if (i + j == N - 1) System.out.print(2);
                    else if (i == j) System.out.print(1);
                    else System.out.print(3);
                }
                System.out.println();
            }
        }


    }

}
