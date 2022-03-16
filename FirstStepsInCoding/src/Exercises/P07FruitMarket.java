package Exercises;

import java.util.Scanner;

public class P07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStrawberries = Double.parseDouble(scanner.nextLine());
        double kgBananas = Double.parseDouble(scanner.nextLine());
        double kgOranges = Double.parseDouble(scanner.nextLine());
        double kgRaspberries = Double.parseDouble(scanner.nextLine());
        double kgStrawberries = Double.parseDouble(scanner.nextLine());

        double priceRaspberries = priceStrawberries / 2;
        double priceOranges = priceRaspberries - (priceRaspberries * 0.4);
        double priceBananas = priceRaspberries - (priceRaspberries * 0.8);

        double sumRaspberries =  kgRaspberries * priceRaspberries;
        double sumOranges = kgOranges * priceOranges;
        double sumBananas = kgBananas * priceBananas;
        double sumStrawberries = kgStrawberries * priceStrawberries;

        double sumAll = sumRaspberries + sumOranges + sumBananas + sumStrawberries;
        System.out.printf("%.2f", sumAll);


    }
}
