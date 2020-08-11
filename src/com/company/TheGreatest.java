package com.company;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int AB = (a + b + Math.abs(a - b)) / 2;
        int greater = (AB + c + Math.abs(AB - c)) / 2;
        System.out.println(greater + " eh o maior");

        /*
         * int max = a;
         * if(b > a) max = b;
         * if(c > max) max = c;
         * System.out.println(max + " eh o maior");
         * */

        //        if ( a > b){
        //            if (a > c){
        //                System.out.println(a +" eh o maior");
        //            }else {
        //                System.out.println(c + " eh o maior");
        //            }
        //        }else {
        //            // b > a
        //            if (b > c ){
        //                System.out.println(b +" eh o maior");
        //            }else {
        //                System.out.println(c+ " eh o maior");
        //            }
        //        }


    }
}
