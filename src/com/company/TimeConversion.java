package com.company;

import java.util.Scanner;

class TimeConversion {
    public static void main(String[] args) {
        int hours , minutes, seconds;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        hours = x /3600;
        minutes = (x%3600)/60;
        seconds = x%60;
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}