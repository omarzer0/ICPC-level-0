package com.company;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double Y = sc.nextDouble();
        System.out.println(String.format("%.3f", (X/Y))+" km/l");

//        //----- another solution
//        System.out.println((Math.round((X / Y)*1000.0)/1000.0) + " km/l");
//        //----- another solution
//        DecimalFormat decimalFormat = new DecimalFormat("#.000");
//        System.out.println(decimalFormat.format(X/Y) + " km/l");
    }
}
