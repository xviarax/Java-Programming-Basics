package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (season.equals("Spring") || season.equals("Autumn")) {
            if (km <=5000){
            price = 0.75;
        } else if (km <=10000){
                price = 0.95;
            } else if (km <= 20000) {
                price = 1.45;
            }} else if (season.equals("Summer")) {
            if (km <=5000){
                price = 0.90;
            } else if (km <=10000){
                price = 1.10;
            } else if (km <= 20000) {
                price = 1.45;
    }} else if (season.equals("Winter")) {
                if (km <=5000){
                    price = 1.05;
                } else if (km <=10000){
                    price = 1.25;
                } else if (km <= 20000) {
                    price = 1.45;
            }}
                double salary = (price*km)*4;
                double total = salary - salary*0.1;
                System.out.printf(Locale.US,"%.2f", total);
}}
