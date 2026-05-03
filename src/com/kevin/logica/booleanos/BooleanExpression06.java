package com.kevin.logica.booleanos;

// Problem: Evaluate a boolean expression
// Input: none (predefined values)
// Output: boolean result (true or false)

public class BooleanExpression06 {
    public static void main(String[] args) {

        // Processing
        boolean result = (!(5 == 5) || 2 < 3 && !(4 > 1) || 6 == 6);

        // Output
        System.out.println("Result: " + result);

        // Expected: True
    }

}