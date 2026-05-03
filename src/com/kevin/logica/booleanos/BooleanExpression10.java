package com.kevin.logica.booleanos;

// Problem: Evaluate a boolean expression
// Input: none (predefined values)
// Output: boolean result (true or false)

public class BooleanExpression10 {
    public static void main(String[] args) {

        // Processing
        boolean result =  (!(10 > 20) && (5 > 3 || 7 < 1) && !(4 < 2) || 6 == 6);

        // Output
        System.out.println("Result: " + result);

        // Expected: True
    }

}