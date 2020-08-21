package com.company;

public class Utils {


    private static void printArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] rotateArray(char[][] arr) {
        char[][] rotatedArray = new char[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                rotatedArray[i][j] = arr[j][i];
            }
        }
        return rotatedArray;
    }

    private static int[] reverseArray(int[] arr) {
        int len = arr.length;
        int[] reversed = new int[len];
        for (int i = 0; i < len; i++) {
            reversed[len - 1 - i] = arr[i];
        }
        return reversed;
    }
}
