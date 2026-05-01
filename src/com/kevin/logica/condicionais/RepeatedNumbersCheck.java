package com.kevin.logica.condicionais;

// Problem: Check if there are repeated numbers among four values
// Input: four real numbers
// Output: message indicating if any numbers are repeated

import java.util.Scanner;

public class RepeatedNumbersCheck {
    public static void main(String[] args) {

        // input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double n2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double n3 = scanner.nextDouble();

        System.out.print("Enter the fourth number: ");
        double n4 = scanner.nextDouble();

        // processing
        boolean hasRepeated =
                (n1 == n2) || (n1 == n3) || (n1 == n4) ||
                        (n2 == n3) || (n2 == n4) ||
                        (n3 == n4);

        // output
        if (hasRepeated) {
            System.out.println("There are repeated numbers.");
        } else {
            System.out.println("There are no repeated numbers.");
        }

        scanner.close();
    }
}