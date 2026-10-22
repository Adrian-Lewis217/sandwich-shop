package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What size would you like (1 for Regular, 2 for large): ");
        int size = scanner.nextInt();
        scanner.nextLine();

        double basePrice;

        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid sandwich size");
            return;
        }

        System.out.println("Would you like it loaded? (yes/no): ");
        String loadedAnswer = scanner.nextLine();

        if(loadedAnswer.equalsIgnoreCase("yes")){
            if(size == 1){
                basePrice = basePrice + 1.00;
            } else {
                basePrice = basePrice + 1.75;
            }
        }

        System.out.print("What is your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;

        if (age <= 17) {
            discount = 0.1;
        } else if (age >= 65) {
            discount = 0.2;
        }

        double finalPrice = basePrice * (1 - discount);

        System.out.printf("Cost of sandwich: $%.2f%n", finalPrice);

        scanner.close();

    }
}
