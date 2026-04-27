package com.kevin.logica.calculos;

// Problem: Calculate the new stock after a percentage increase
// Input: current stock quantity and percentage increase
// Output: updated stock quantity

import java.util.Scanner;

public class PercentageIncreaseInStock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Current stock: ");
        int currentStock = scanner.nextInt();
        System.out.println("Percentual increase: ");
        double percentageIncrease = scanner.nextDouble();

        double newStock = currentStock + (currentStock * percentageIncrease / 100);

        System.out.println("The new stock corresponds to: "+newStock+" units");
    }
}
