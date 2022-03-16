package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double left = 0;
        double left2 = 0;

        double viP = 499.99;
        double normal = 249.99;
        double transport =0;

        if ( people >= 1 && people <=4 ) {
            transport = budget*0.75;
        } else if ( people <= 9 ){
            transport = budget*0.60;
        } else if ( people <= 24 ) {
            transport = budget * 0.50;
        } else if ( people <= 49 ) {
            transport = budget * 0.40;
        } else if ( people >= 50) {
            transport = budget*0.25;
        }
         left = (budget - transport) ;

        if (category.equals("VIP")) {
            left2 = people * viP;
            if (left2 <= left) {
                System.out.printf(Locale.US,"Yes! You have %.2f leva left.", left-left2);
            } else {
                System.out.printf(Locale.US,"Not enough money! You need %.2f leva.", left2-left);
            }
        } else if (category.equals("Normal")) {
            left2 = people * normal;
            if (left2 <= left) {
                System.out.printf(Locale.US,"Yes! You have %.2f leva left.", left-left2);
            } else {
                System.out.printf(Locale.US,"Not enough money! You need %.2f leva.", left2-left);
            }
        }


    }
}
