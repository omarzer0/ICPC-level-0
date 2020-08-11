package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int largestTowerHeight = 0;
        int totalNumber = 1;
        int tempCounter = 1;

        int numberOfBars = sc.nextInt();
        int[] arr = new int[numberOfBars];
        for (int i = 0; i < numberOfBars; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (temp == arr[i + 1]) {
                tempCounter++;
                temp = arr[i + 1];
            } else {
                if (tempCounter > largestTowerHeight) largestTowerHeight = tempCounter;
                temp = arr[i + 1];
                tempCounter = 1;
                totalNumber++;
            }
        }

        if (tempCounter > largestTowerHeight) largestTowerHeight = tempCounter;

        System.out.println(largestTowerHeight + " " + totalNumber);


    }
}
