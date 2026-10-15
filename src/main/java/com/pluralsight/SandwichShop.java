package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What size would you like: ");
        String size = scanner.nextLine();

        double regularPrice = 0;
        double largePrice = 0;

        if (size.equalsIgnoreCase("Regular")) {
            regularPrice = 5.45;
        } else {
            largePrice = 8.95;
        }
        double discount = 0;

        System.out.print("What is your age: ");
        int age = scanner.nextInt();

        double regularCost;
        double largeCost;

        if (age <= 17) {
            discount = 0.1;
            regularCost = regularPrice * discount - regularPrice;
            largeCost = largePrice * discount - largePrice;
        } else if (age >= 65) {
            discount = 0.2;
            regularCost = regularPrice * discount - regularPrice;
            largeCost = largePrice * discount - largePrice;
        } else {
            System.out.println("No discount");
            regularCost = regularPrice;
            largeCost = largePrice;
        }

        boolean isLoaded;

        System.out.print("Would you like to loaded your sandwich: ");
        isLoaded = scanner.nextBoolean();



        System.out.println("That will be $" + Math.abs(regularCost));
        System.out.println("That will be $" + Math.abs(largeCost));


    }
}
