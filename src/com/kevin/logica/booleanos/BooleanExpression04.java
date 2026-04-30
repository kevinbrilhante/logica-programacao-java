package com.kevin.logica.booleanos;

// Problem: Evaluate a boolean expression
// Input: none (predefined values)
// Output: boolean result (true or false)

public class BooleanExpression04 {
    public static void main(String[] args) {

        // Processing
        boolean result = (!(7 > 2 || 5 == 5) && 4 > 1 || 6 < 9);

        // Output
        System.out.println("Result: " + result);

        // Expected: True
    }

}