package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String season = scanner.nextLine();
    String groupKind = scanner.nextLine();
    int students = Integer.parseInt(scanner.nextLine());
    int nights = Integer.parseInt(scanner.nextLine());
    double priceNights = 0;

    if (season.equals("Winter")) {
        if (groupKind.equals("boys") || groupKind.equals("girls")) {
            priceNights = 9.60;
        } else if (groupKind.equals("mixed")) {
            priceNights = 10;

    }} if (season.equals("Spring")) {
            if (groupKind.equals("boys") || groupKind.equals("girls")) {
                priceNights = 7.20;
            } else if (groupKind.equals("mixed")) {
                priceNights = 9.50;

            }} if (season.equals("Summer")) {
            if (groupKind.equals("boys") || groupKind.equals("girls")) {
                priceNights = 15;
            } else if (groupKind.equals("mixed")) {
                priceNights = 20; }}

        double sum = priceNights *students * nights;
    if (students >= 50) {
        sum = sum*0.50;
    } else if (students >= 20 && students < 50) {
        sum = sum * 0.85;
    } else if (students >= 10 && students < 20) {
        sum = sum * 0.95;}

        if (season.equals("Winter")) {
            switch (groupKind) {
                case "girls":
                    System.out.printf(Locale.US,"Gymnastics %.2f lv.", sum);
                    break;
                case "boys":
                    System.out.printf(Locale.US,"Judo %.2f lv.", sum);
                    break;
                    case "mixed":
                    System.out.printf(Locale.US,"Ski %.2f lv.", sum);
                    break;
            }} else if (season.equals("Spring")) {
            switch (groupKind) {
                case "girls":
                    System.out.printf(Locale.US,"Athletics %.2f lv.", sum);
                    break;
                case "boys":
                    System.out.printf(Locale.US,"Tennis %.2f lv.", sum);
                    break;
                case "mixed":
                    System.out.printf(Locale.US,"Cycling %.2f lv.", sum);
                    break;
            }} else if (season.equals("Summer")) {
            switch (groupKind) {
                case "girls":
                    System.out.printf(Locale.US,"Volleyball %.2f lv.", sum);
                    break;
                case "boys":
                    System.out.printf(Locale.US,"Football %.2f lv.", sum);
                    break;
                case "mixed":
                    System.out.printf(Locale.US,"Swimming %.2f lv.", sum);
                    break;
            }
        }

}}
