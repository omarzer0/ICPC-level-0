package com.company;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[200001];
        int[] sec = new int[200001];
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int indx = 0;
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            sec[indx] = start;
            sec[indx+1] = end;
        }

        for (int i = 0; i < 200001; i+=2) {
            sec[i] = 0;
            sec[i+1] = 0;
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
