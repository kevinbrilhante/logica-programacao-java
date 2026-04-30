package com.kevin.logica.calculos;

// Problem: Calculate download time based on file size and connection speed
// Input: file size (in bits) and connection speed (bits per second)
// Output: download time (in seconds)

import java.util.Scanner;

public class TimeCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file size: ");
        float fileSize = scanner.nextFloat();
        System.out.println("Enter the connection speed: ");
        float connectionSpeed = scanner.nextFloat();

        float downloadTime = fileSize / connectionSpeed;

        System.out.println("The time required for download is: "+downloadTime+" seconds");

    }
}
