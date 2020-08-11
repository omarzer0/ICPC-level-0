package com.company;

import java.util.Scanner;

public class BhaskarasFormula {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double underSqrt = Math.pow(B, 2) - (4 * A * C);

        if (A <= 0 || B <= 0 || C <= 0 || underSqrt < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double sqrtRoot = Math.sqrt(underSqrt);
            double x1 = (-B + sqrtRoot) / (2 * A);
            double x2 = (-B - sqrtRoot) / (2 * A);
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }


    }
}
