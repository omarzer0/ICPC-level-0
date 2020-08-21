package com.company;

import java.util.Scanner;

public class Testt {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int serPoint = 0; // player 1
        int dimaPoint = 0; //player 2
        int player = 1;
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int plus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (player == 1){
                player = 2;
                if (arr[0]>=arr[N-1]){
                    plus = arr[0];
                    arr[0] = arr[N/2-1];
                    arr[N/2-1] = 0;
                }else {
                    plus = arr[N-1];
                    arr[N-1] = arr[N-2];
                    arr[N-2] = 0;
                }
                serPoint += plus;
            }else {
                player = 1;
                if (arr[0]>=arr[N-1]){
                    plus = arr[0];
                    arr[0] = arr[N/2-1];
                    arr[N/2-1] = 0;
                }else {
                    plus = arr[N-1];
                    arr[N-1] = arr[N-2];
                    arr[N-2] = 0;
                }
                dimaPoint += plus;
            }
        }

        System.out.println(serPoint+" "+dimaPoint);

    }
}
