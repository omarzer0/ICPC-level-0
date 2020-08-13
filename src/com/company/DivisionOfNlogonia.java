package com.company;

import java.util.Scanner;

public class DivisionOfNlogonia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int input = sc.nextInt();
            if (input == 0) break;

            int n = sc.nextInt();// div point
            int m = sc.nextInt();// div points

            for (int i = 0; i < input; ++i) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                String s;
                if (x > n && y > m) s = "NE";
                else if (x < n && y < m) s = "SO";
                else if (x > n && y < m)s = "SE";
                else if (x < n && y > m) s = "NO";
                else s="divisa";
                System.out.println(s);

            }


        }
    }
}
