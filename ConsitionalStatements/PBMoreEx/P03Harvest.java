package PBMoreEx;

import java.util.Scanner;

public class P03Harvest {
    // Работи!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double sumGrapes = (x * y) * 0.4;
        double wine = sumGrapes / 2.5;

        if (wine >= z) {
            double left = Math.ceil(wine - z);
            wine = Math.floor(wine);
            double forEveryWorker = Math.ceil(left / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.", wine, left , forEveryWorker);
        } else {
            double needed = Math.floor(z - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", needed);

        }


    }
}
