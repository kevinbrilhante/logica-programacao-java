package com.kevin.logica.calculos;

// Problem: calculate discount and final price of a product
// Input: product price and discount percentage
// Output: discount value and final price

import java.util.Scanner;

public class DiscountOnPurchase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the product value: ");
        double price = scanner.nextDouble();
        System.out.println("Please, enter the discount amount: ");
        double discountPercentage = scanner.nextDouble();


        double discount = (price * discountPercentage) / 100;
        double finalPrice = price - discount;

        System.out.println("your discount is: U$ "+discount);
        System.out.println("The final value of the product is: U$"+finalPrice);

    }
}
