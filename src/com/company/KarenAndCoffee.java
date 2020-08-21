package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class KarenAndCoffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> recipesArrayList = new ArrayList<>();
        ArrayList<Integer> commonArrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int begging = sc.nextInt();
            int last = sc.nextInt();
            for (int j = begging; j <= last; j++) {
                recipesArrayList.add(j);
            }
        }


        for (int i = 0; i < recipesArrayList.size(); i++) {
            int counter = 0;
            for (int j = i + 1; j < recipesArrayList.size(); j++) {
                if (recipesArrayList.get(i).equals(recipesArrayList.get(j))) {
                    counter++;
                    if (counter == k - 1) {
                        commonArrayList.add(recipesArrayList.get(i));
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < q; i++) {
            int counter = 0;
            int begging = sc.nextInt();
            int last = sc.nextInt();
            for (int j = 0; j < commonArrayList.size(); j++) {
                for (int l = begging; l <= last; l++) {
                    if (commonArrayList.get(j) == l) counter++;
                }
            }
            System.out.println(counter);
        }

    }
}
