package com.company;

import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double totalSales = sc.nextDouble();

        double totalSalary = salary + (15 * totalSales)/100 ;
        System.out.printf("TOTAL = R$ %.2f\n",totalSalary);

    }
}
