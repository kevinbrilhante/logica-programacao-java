package com.kevin.logica.calculos;

// Problem: Calculate the total value of a product stock
// Input: quantity of units and unit price
// Output: total stock value

import java.util.Scanner;

public class TotalStockValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of product units: ");
        int units = scanner.nextInt();
        System.out.println("enter the unit value in BRL: ");
        double value = scanner.nextDouble();

        double stockValue = units * value;

        System.out.println("The total value of the stock corresponds to: BRL "+stockValue);
    }
}
