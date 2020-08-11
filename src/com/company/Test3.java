package com.company;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean b = true;


        if (s.length() == t.length()) {
            for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
                if (s.charAt(i) != t.charAt(j) && b) {
                    System.out.println("NO");
                    b = false;
                }
            }
        }else {
            b = false;
        }

        if (b) {
            System.out.println("YES");
        }
    }
}
