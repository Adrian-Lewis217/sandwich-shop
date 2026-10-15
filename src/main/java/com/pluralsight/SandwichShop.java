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

        if (age <= 17){
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        } else {
            System.out.println("No discount");
        }
        double cost = regularPrice * discount;
        System.out.println("That will be $" + cost);


    }
}
