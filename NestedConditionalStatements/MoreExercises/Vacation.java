package MoreExercises;

import java.util.Locale;
import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;

        if (budget <= 1000) {
            if (season.equals("Summer")){
                price = budget*0.65;
            System.out.printf(Locale.US,"Alaska - Camp - %.2f", price);
        } else if (season.equals("Winter")) {
                price = budget*0.45;
                System.out.printf(Locale.US,"Morocco - Camp - %.2f", price);
    }} else if (budget > 1000 && budget <= 3000) {
            if (season.equals("Summer")){
                price = budget*0.80;
                System.out.printf(Locale.US,"Alaska - Hut - %.2f", price);
            } else if (season.equals("Winter")) {
                price = budget*0.6;
                System.out.printf(Locale.US,"Morocco - Hut - %.2f", price);
            }} else if (budget > 3000) {
            if (season.equals("Summer")){
                price = budget*0.90;
                System.out.printf(Locale.US,"Alaska - Hotel - %.2f", price);
            } else if (season.equals("Winter")) {
                price = budget*0.9;
                System.out.printf(Locale.US,"Morocco - Hotel - %.2f", price);
            }}
    }}
