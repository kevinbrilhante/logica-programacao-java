package com.kevin.logica.calculos;

// Problem: Calculate profit and profit margin of a product
// Input: selling price and cost price
// Output: profit value and profit margin percentage

import java.util.Scanner;

public class ProfitAndProfitMargin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sale amount: ");
        double sale = scanner.nextDouble();
        System.out.println("enter the acquisition cost: ");
        double acquisitionCost = scanner.nextDouble();

        double profit = sale - acquisitionCost;
        double profitMargin = (profit / acquisitionCost) * 100;

        System.out.println("Your profit was: USD"+profit);
        System.out.println("Your profit margin was: USD"+profitMargin);
    }
}
