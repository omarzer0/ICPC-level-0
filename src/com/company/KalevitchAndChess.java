package com.company;

import java.util.Scanner;

public class KalevitchAndChess {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 8; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int rowCounter = 0;
        int colCounter = 0;

        int sum = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[i][j] == 'B') rowCounter++;
                if (arr[j][i] == 'B') colCounter++;
            }
            sum += rowCounter / 8 + colCounter / 8;
            rowCounter = 0;
            colCounter = 0;
        }

        if (sum >= 8) sum = sum / (sum / 8);
        System.out.println(sum);


    }


}