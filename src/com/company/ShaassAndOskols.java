package com.company;

import java.util.Scanner;

public class ShaassAndOskols {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int wire = sc.nextInt() - 1;
            int killed = sc.nextInt();


            int rightToBottom = Math.abs(arr[wire] - killed);
            int leftToTop = Math.abs(killed - 1);
            if (wire != 0 && wire != N - 1) {
                arr[wire - 1] += leftToTop;
                arr[wire + 1] += rightToBottom;
                arr[wire] = 0;
            } else if (wire == 0 && wire != N-1) {
                arr[wire + 1] += rightToBottom;
                arr[wire] = 0;
            } else if (wire == N - 1 && wire != 0) {
                arr[wire - 1] += leftToTop;
                arr[wire] = 0;
            }else {
                arr[wire] = 0;
            }


        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
