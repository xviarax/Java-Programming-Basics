package Exercises;

import java.util.Scanner;

public class P06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int campaignDays = Integer.parseInt(scanner.nextLine());
        int sweetMakers = Integer.parseInt(scanner.nextLine());
        int cakeCount = Integer.parseInt(scanner.nextLine());
        int wafflesCount = Integer.parseInt(scanner.nextLine());
        int pancakesCount = Integer.parseInt(scanner.nextLine());

        double priceCakes = cakeCount * 45.00;
        double priceWaffles = wafflesCount * 5.80;
        double pricePancakes = pancakesCount * 3.20;

        double sumPerDay = (priceCakes + priceWaffles + pricePancakes) * sweetMakers;
        double sumOfCampaign = sumPerDay * campaignDays;
        double sumAfterCosts = sumOfCampaign - ( sumOfCampaign / 8);

        System.out.printf("%.2f", sumAfterCosts);
    }
}
