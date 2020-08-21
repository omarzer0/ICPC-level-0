package com.company;

import java.util.Scanner;

public class SquareArrayIV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int placeOne = N / 3;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j == N / 2 & i == N / 2) System.out.print(4);
                    else if (i >= placeOne & i < N - placeOne & j >= placeOne & j < N - placeOne) System.out.print(1);
                    else if (i == j) System.out.print(2);
                    else if (i + j == N - 1) System.out.print(3);
                    else System.out.print(0);
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}