package com.kevin.logica.booleanos;

// Problem: Evaluate a boolean expression
// Input: none (predefined values)
// Output: boolean result (true or false)

public class BooleanExpression08 {
    public static void main(String[] args) {

        // Processing
        boolean result = (6 <= 6 && !(4 < 2) || 9 > 10 && 7 == 7);

        // Output
        System.out.println("Result: " + result);

        // Expected: True
    }

}