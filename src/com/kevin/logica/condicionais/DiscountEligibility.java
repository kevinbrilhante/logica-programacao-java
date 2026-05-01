package com.kevin.logica.condicionais;

// Problem: Determine if a person is eligible for a discount based on age
// Input: age (integer)
// Output: eligibility for discount (true/false or message)

import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = scanner.nextInt();

        if (age <= 16 || age >= 60){
            System.out.println("discount granted");
        }
        else{
            System.out.println("discount not granted");
        }

        scanner.close();

    }
}
