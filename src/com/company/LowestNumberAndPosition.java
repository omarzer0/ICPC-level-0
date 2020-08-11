package com.company;

import java.util.Scanner;

public class LowestNumberAndPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int minNumber = 0;
        int position = 0;

        for (int i = 0; i < N ; i++) {
            int input = arr[i] = sc.nextInt();
            if (i == 0) minNumber = input;

            if (minNumber > input){
                minNumber = input;
                position = i;
            }
        }

        System.out.println("Menor valor: "+minNumber);
        System.out.println("Posicao: "+ position);

    }
}
