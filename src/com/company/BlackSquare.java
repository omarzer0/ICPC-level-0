package com.company;

import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();

        int a1counter = 0;
        int a2counter = 0;
        int a3counter = 0;
        int a4counter = 0;

        String s = sc.next();
        for (int i = 0; i < s.length() ; i++) {
            switch (s.charAt(i)){
                case '1': a1counter++;break;
                case '2': a2counter++;break;
                case '3': a3counter++;break;
                case '4': a4counter++;break;
            }
        }
        System.out.println(a1*a1counter + a2*a2counter + a3*a3counter + a4*a4counter);


    }
}
