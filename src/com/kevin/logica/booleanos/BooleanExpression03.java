package com.kevin.logica.booleanos;

// Problem: Evaluate a boolean expression
// Input: none (predefined values)
// Output: boolean result (true or false)

public class BooleanExpression03 {
    public static void main(String[] args) {

        // Processing
        boolean result = (10 < 5 && 3 > 1 || 9 == 9 && !(5 < 3));

        // Output
        System.out.println("Result: " + result);

        // Expected: True
    }

}