package com.kevin.logica.condicionais;

// Problem: Determine if a number is even or odd
// Input: integer number
// Output: even or odd classification

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("This number is even.");
        }
        else{
            System.out.println("This number is odd.");
        }

        scanner.close();

    }
}
