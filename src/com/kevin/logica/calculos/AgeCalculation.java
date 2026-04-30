package com.kevin.logica.calculos;

// Problem: Calculate a person's current age and age in 2030
// Input: birth year and current year
// Output: current age and age in 2030

import java.util.Scanner;

public class AgeCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int birth = scanner.nextInt();
        System.out.println("Enter the current year: ");
        int currentYear = scanner.nextInt();

        int age = currentYear - birth;
        int futureAge = 2030 - birth;

        System.out.println("Your age is: "+age);
        System.out.println("Your age in 2030 will be: "+futureAge);

    }
}
