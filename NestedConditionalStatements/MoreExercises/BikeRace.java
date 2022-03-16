package MoreExercises;

import java.io.StringReader;
import java.util.Locale;
import java.util.Scanner;
public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String kind = scanner.nextLine();
        double priceJun = 0;
        double priceSen = 0;
        double sum = 0;

        switch (kind) {
            case "trail":
                priceJun = 5.50;
                priceSen = 7;
                break;
            case "cross-country":
                priceJun = 8.00;
                priceSen = 9.50;
                break;
            case "downhill":
                priceJun = 12.25;
                priceSen = 13.75;
                break;
            case "road":
                priceJun = 20.0;
                priceSen = 21.50;
                break;
        }
        sum = priceJun*juniors + priceSen*seniors;
        if (kind.equals("cross-country") && (seniors+juniors) >= 50) {
            sum = sum * 0.75;
        }
        double afterCosts = sum *0.95;
        System.out.printf(Locale.US,"%.2f", afterCosts);



    }
}
