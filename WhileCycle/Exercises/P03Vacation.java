package Exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int daysSpendingMoney = 0;
        int days = 0;

        while (moneyNeeded > money && daysSpendingMoney < 5) {
        String options = scanner.nextLine();
        double moneySpend = Double.parseDouble(scanner.nextLine());
        days++;
            if (options.equals("spend")) {
                daysSpendingMoney++;
                money = money - moneySpend;
                if (money <= 0) {
                    money = 0;
                }
            }
            if (options.equals("save")) {
                money = money + moneySpend;
                daysSpendingMoney = 0;

            }}

        if (daysSpendingMoney == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if (money >= moneyNeeded){
            System.out.printf("You saved the money for %d days.", days);
        }



    }
}
