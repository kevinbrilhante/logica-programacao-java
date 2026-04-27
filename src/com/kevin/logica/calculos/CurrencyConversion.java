package com.kevin.logica.calculos;

// Problem: Convert an amount from BRL to USD
// Input: amount in BRL and exchange rate (BRL per USD)
// Output: amount in USD

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount in BRL: ");
        double amountInBRL = scanner.nextDouble();
        System.out.println("Enter the current quote: ");
        double exchangeRate = scanner.nextDouble();

        double dollarsReceived = amountInBRL / exchangeRate;

        System.out.println("Amount in USD: "+dollarsReceived);
    }
}
