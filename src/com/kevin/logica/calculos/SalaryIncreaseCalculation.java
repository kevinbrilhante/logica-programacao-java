package com.kevin.logica.calculos;

// Problem: Calculate salary increase and new salary
// Input: current salary and increase percentage
// Output: increase amount and updated salary

import java.util.Scanner;

public class SalaryIncreaseCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current salary: ");
        float currentSalary = scanner.nextFloat();
        System.out.println("Enter the percentual increase: ");
        float percentualIncrease = scanner.nextFloat();

        float newSalary = currentSalary + (currentSalary * percentualIncrease) / 100;
        float increaseValue = (newSalary - currentSalary);

        System.out.println("Your new salary corresponds to: USD "+newSalary);
        System.out.println("The amount of the increase was: USD "+increaseValue);
    }
}
