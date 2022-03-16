package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int laleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double priceHrizantemi =0;
        double priceRoses =0;
        double priceLaleta =0;


        switch (season){
            case "Spring":
            case "Summer":
                priceHrizantemi = 2;
                priceRoses = 4.10;
                priceLaleta = 2.50;
                break;
            case "Autumn":
            case "Winter":
                priceHrizantemi = 3.75;
                priceRoses = 4.50;
                priceLaleta = 4.15;
                break;
        }
        double sum =  + hrizantemi*priceHrizantemi + roses*priceRoses + laleta*priceLaleta;
        if (holiday.equals("Y")) {
            sum = sum + sum*0.15;
        }
        if (laleta > 7 && season.equals("Spring")) {
            sum = sum * 0.95;
        }
        if (roses >= 10 && season.equals("Winter")) {
            sum = sum * 0.90;
        }
        if ((hrizantemi+roses+laleta) > 20) {
            sum = sum * 0.80;
        }
        System.out.printf(Locale.US,"%.2f", sum + 2);
    }
}
