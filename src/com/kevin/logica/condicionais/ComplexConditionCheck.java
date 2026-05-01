package com.kevin.logica.condicionais;

// Problem: Validate a complex logical condition
// Input: predefined integer values x, y, and z
// Output: condition met or condition not met

public class ComplexConditionCheck {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        int z = 10;

        boolean firstCondition = (x > y && z != 0 && (x + z) > 50);
        boolean secondCondition = ((y % 2 == 0) && !(y < 0));

        if (firstCondition || secondCondition) {
            System.out.println("Condition met.");
        }
        else{
            System.out.println("Condition not met.");
        }

    }
}
