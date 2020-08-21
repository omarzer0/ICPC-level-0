package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int counter = 1;
        int result = arr[0];
        for (int i = 0; i < n - 1; i++) {

            if (result > sum - result) {
                break;
            } else {
                counter++;
                result += arr[i + 1];
            }

        }
        System.out.println(counter);

    }
}
