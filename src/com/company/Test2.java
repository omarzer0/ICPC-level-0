package com.company;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[200001];
        int[] arr2 = new int[200001];
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr2[start]++;
            arr2[end] = -2;
        }

        for (int i = 90; i < 101; i++) {
            System.out.print(arr2[i] + " ");
            if (arr2[i - 1] > 1 && arr2[i + 1] >= 0) {
                arr2[i] = 1;
            }
            System.out.print(arr2[i] + " ");
        }


        for (int i = 0; i < q; i++) {
            int counter = 0;
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j <= end; j++) {
                if (arr[j] >= k) counter++;
            }
            System.out.println(counter);
        }
    }
}
