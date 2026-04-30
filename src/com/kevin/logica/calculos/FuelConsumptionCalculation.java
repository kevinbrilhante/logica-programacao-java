package com.kevin.logica.calculos;

// Problem: Calculate the average fuel consumption of a car
// Input: total distance traveled (km) and fuel consumed (liters)
// Output: average consumption (km per liter)

import java.util.Scanner;

public class FuelConsumptionCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance traveled by the vehicle: ");
        float distanceTraveled = scanner.nextFloat();
        System.out.println("Enter the volume of fuel consumed: ");
        float fuelConsumed = scanner.nextFloat();

        float averageConsumption = distanceTraveled / fuelConsumed;

        System.out.println("The average fuel consumption corresponds to: "+averageConsumption+" km/L");

    }
}
