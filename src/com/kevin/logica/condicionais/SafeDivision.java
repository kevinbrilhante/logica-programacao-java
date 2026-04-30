package com.kevin.logica.condicionais;

// Problem: Divide two integers and handle division by zero
// Input: two integer numbers
// Output: division result or error message if division by zero

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (secondNumber == 0) {
            System.out.println("It is not possible to divide by 0");
        }
        else {
            double result = (double) firstNumber / secondNumber;
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
