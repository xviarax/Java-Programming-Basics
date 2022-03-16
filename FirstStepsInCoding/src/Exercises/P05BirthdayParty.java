package Exercises;

import java.util.Scanner;

public class P05BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceRentHall = Double.parseDouble(scanner.nextLine());
        double priceCake = priceRentHall * 0.20;
        double priceDrinks = priceCake * 0.55;
        double priceAnimator = priceRentHall / 3;

        double sum = priceRentHall + priceCake + priceDrinks + priceAnimator;
        System.out.println(sum);


    }
}
