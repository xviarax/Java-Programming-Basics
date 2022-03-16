package Exercises;

import java.util.Scanner;

public class P06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double priceClothing = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double clothing = extras * priceClothing;

        if (decor+clothing > budget) {
            if (extras > 150 ) {
                double priceClothing1 = clothing - clothing * 0.1;
            double needed = (decor+priceClothing1) - budget;
            String name = "Not enough money!";
            System.out.printf("%s %n Wingard needs %.2f leva more.", name, needed);
        } else {
                double result = (decor+clothing) - budget;
                System.out.printf("Not enough money!%nWingard needs %.2f leva more.", result);
            }} else {
        if (extras > 150 ) {
            double priceClothing1 = clothing - clothing * 0.1;
            double priceForMovie = decor + priceClothing1;
            double result = budget - priceForMovie;
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", result);
        } else {
            double result = budget - (decor+clothing);
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", result);
        }

    }
}}
