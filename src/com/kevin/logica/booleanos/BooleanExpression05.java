package com.kevin.logica.booleanos;

// Problem: Evaluate a boolean expression
// Input: none (predefined values)
// Output: boolean result (true or false)

public class BooleanExpression05 {
    public static void main(String[] args) {

        // Processing
        boolean result = (8 > 3 && 3 > 9 || !(7 == 7) && 2 < 3);

        // Output
        System.out.println("Result: " + result);

        // Expected: False
    }

}