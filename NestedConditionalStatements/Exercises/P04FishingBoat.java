package Exercises;
import java.util.Locale;
import java.util.Scanner;
public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double finalprice = 0;

        switch (season) {
            case "Spring":
                finalprice = 3000;
                break;
            case "Summer":
            case "Autumn":
                finalprice = 4200;
                break;
            case "Winter":
                finalprice = 2600;
                break;
        }
            if (fisherman <= 6) {
                finalprice = finalprice*0.9;
            } else if (fisherman <= 11) {
                finalprice = finalprice*0.85;
            } else {
                finalprice =finalprice*0.75;
            }

        if (fisherman % 2 ==0 && !season.equals("Autumn")) {
            finalprice = finalprice *0.95;
        }
        double left = Math.abs(budget - finalprice);
        if (finalprice > budget) {
            System.out.printf(Locale.US,"Not enough money! You need %.2f leva.", left);
        } else {
            System.out.printf(Locale.US,"Yes! You have %.2f leva left.", left);
        }

    }
}
