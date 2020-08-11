package com.company;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double avg = ((A * 2) + (B * 3) + (C * 5)) / 10.0;
        System.out.println("MEDIA = "+String.format("%.1f", avg));
    }
}
