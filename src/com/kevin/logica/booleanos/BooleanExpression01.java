package com.kevin.logica.booleanos;

// Problem: Evaluate a boolean expression
// Input: none (predefined values)
// Output: boolean result (true or false)

public class BooleanExpression01 {
    public static void main(String[] args) {

        // Processing
        boolean result = (5 > 3 && 2 > 1 || 4 < 1 && !(6 < 2));

        // Output
        System.out.println("Result: " + result);

        // Expected: True
    }

}
