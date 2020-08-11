package com.company;

import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        if (salary > 2000) {
            calculateSalary(salary, 4);
        } else if (salary > 1200) {
            calculateSalary(salary, 7);

        } else if (salary > 800) {
            calculateSalary(salary, 10);

        } else if (salary > 400) {
            calculateSalary(salary, 12);

        } else {
            calculateSalary(salary, 15);
        }
    }

    private static void calculateSalary(double salary, int extraPercentage) {
        double extra = salary * extraPercentage / 100;
        double totalSalary = salary + extra;
        System.out.printf("Novo salario: %.2f\n", totalSalary);
        System.out.printf("Reajuste ganho: %.2f\n", extra);
        System.out.println("Em percentual: " + extraPercentage + " %");
    }

}
