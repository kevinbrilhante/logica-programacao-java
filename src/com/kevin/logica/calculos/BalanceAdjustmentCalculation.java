package com.kevin.logica.calculos;

// Problem: Calculate the new balance after a 15% increase
// Input: initial balance
// Output: updated balance after increase

import java.util.Scanner;

public class BalanceAdjustmentCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current balance: ");
        float currentBalance = scanner.nextFloat();

        int percentageIncrease = 15;
        float adjustedBalance = currentBalance + (currentBalance * percentageIncrease) / 100;

        System.out.println("Your new balance is: USD "+adjustedBalance);
    }
}
