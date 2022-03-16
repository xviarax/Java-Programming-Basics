package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;

        if (budget <= 100) {
            System.out.println("Economy class");
            if (season.equals("Summer")) {
                price = budget - budget *0.65;
                System.out.printf(Locale.US,"Cabrio - %.2f", price);
            } else if (season.equals("Winter")) {
                price = budget - budget *0.35;
                System.out.printf(Locale.US,"Jeep - %.2f", price);
        }} else if (budget > 100 && budget <= 500) {
            System.out.println("Compact class");
            if (season.equals("Summer")) {
                price = budget - budget *0.55;
                System.out.printf(Locale.US,"Cabrio - %.2f", price);
            } else if (season.equals("Winter")) {
                price = budget - budget * 0.20;
                System.out.printf(Locale.US,"Jeep - %.2f", price);
            }} else if (budget > 500) {
            System.out.println("Luxury class");
                price = budget - budget * 0.10;
                System.out.printf(Locale.US,"Jeep - %.2f", price);}


    }
}
