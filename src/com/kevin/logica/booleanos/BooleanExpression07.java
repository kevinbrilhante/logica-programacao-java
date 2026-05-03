package com.kevin.logica.booleanos;

// Problem: Evaluate a boolean expression
// Input: none (predefined values)
// Output: boolean result (true or false)

public class BooleanExpression07 {
    public static void main(String[] args) {

        // Processing
        boolean result = (!(3 == 3) && 4 > 1 || 8 != 8 && !(5 < 10));

        // Output
        System.out.println("Result: " + result);

        // Expected: False
    }

}