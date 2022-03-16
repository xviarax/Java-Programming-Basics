package Exercises;
import java.util.Locale;
import java.util.Scanner;
public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            switch (season) {
                case "summer":
                    System.out.printf(Locale.US,"Camp - %.2f", budget*0.30);
                    break;
                case "winter":
                    System.out.printf(Locale.US,"Hotel - %.2f", budget*0.70);
                    break;

            }
        } else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            switch (season) {
                case "summer":
                    System.out.printf(Locale.US,"Camp - %.2f", budget*0.40);
                    break;
                case "winter":
                    System.out.printf(Locale.US,"Hotel - %.2f", budget*0.80);
                    break;
    } } else {
            System.out.println("Somewhere in Europe");
                    System.out.printf(Locale.US,"Hotel - %.2f", budget*0.90);}}}

