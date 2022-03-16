import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForTravelling = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
        int countToys = puzzles + dolls + bears + minions + trucks;

        if (countToys >= 50) {
            double finalPrice = sum - sum*0.25;
            double win = finalPrice - 0.1*finalPrice;

            if (priceForTravelling <= win) {
                System.out.printf("Yes! %.2f lv left.", win - priceForTravelling);
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", priceForTravelling - win);
            } }
        else {
            double win = sum - 0.1 * sum;
            if (priceForTravelling <= win) {
                System.out.printf("Not enough money! %.2f lv needed.", win - priceForTravelling);
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", priceForTravelling - win);
            }

        }



    }
}

