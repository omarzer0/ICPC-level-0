package com.company;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", (A * C) * 0.5);
        System.out.printf("CIRCULO: %.3f\n", C * C*  3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", ((A + B) * 0.5) * C);
        System.out.printf("QUADRADO: %.3f\n", B * B);
        System.out.printf("RETANGULO: %.3f\n", A * B);
    }
}
