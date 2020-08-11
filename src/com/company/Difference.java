package com.company;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        boolean success = false;

        if (C >= 0 && D >= 0 && A % 2 == 0) {
            if (B > C && D > A){
                if ((C+D)>(A+B)){
                    success =true;
                }
            }
        }

        if (success)
            System.out.println("Valores aceitos");
        else
            System.out.println("Valores nao aceitos");

    }
}
