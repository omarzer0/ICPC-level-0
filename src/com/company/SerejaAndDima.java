package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int serPoint = 0; // player 1
        int dimaPoint = 0; //player 2
        int player = 1;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }

        int plus=0;
        for (int i = 0; i < N; i++) {
            if (player == 1){
                player = 2;
                if (arr.get(0)>= arr.get(arr.size()-1)) {
                    plus = arr.get(0);
                    arr.remove(0);
                }else {
                    plus = arr.get(arr.size()-1);
                    arr.remove(arr.get(arr.size()-1));
                }
                serPoint +=plus;
            }else {
                player = 1;
                if (arr.get(0)>= arr.get(arr.size()-1)) {
                    plus = arr.get(0);
                    arr.remove(0);
                }else {
                    plus = arr.get(arr.size()-1);
                    arr.remove(arr.get(arr.size()-1));
                }
                dimaPoint += plus;
            }
        }

        System.out.println(serPoint+" "+dimaPoint);



        
    }


}
