package com.kevin.logica.condicionais;

// Problem: Calculate a student's weighted average and determine approval status
// Input: student name, student ID, grade1, grade2
// Output: student name, student ID, calculated average, and approval status

import java.util.Scanner;

public class StudentAverageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your student ID: ");
        String studentID = scanner.next();
        System.out.println("Enter your grade 1: ");
        double grade1 = scanner.nextDouble();
        System.out.println("Enter your grade 2: ");
        double grade2 = scanner.nextDouble();

        double average = (grade1 + 2 * grade2) / 3;

        boolean isApproved = (average >= 6);

        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.printf("Average: %.1f%n", average);

        if (isApproved) {
            System.out.println("Final situation: Approved");
        }
        else {
            System.out.println("Final situation: Failed");
        }
        scanner.close();
    }
}
