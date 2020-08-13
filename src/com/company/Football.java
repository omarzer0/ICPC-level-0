package com.company;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int counter = 0;
        boolean dangerous = false;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) counter++;
            else counter = 0;

            // or make the counter starts from 1 and check if it >=7
            if (counter >= 6) {
                dangerous = true;
                break;
            }
        }

        String ss = dangerous ? "YES" : "NO";
        System.out.println(ss);

    }
}
