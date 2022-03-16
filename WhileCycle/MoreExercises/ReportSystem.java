package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cash = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double counterCash = 0;
        double counterCard = 0;
        int count = 0;
        double valueCard = 0;
        double valueCash = 0;
        int value = 0;

        while (!input.equals("End")) {
            count++;
            int money = Integer.parseInt(input);


                if (count % 2 ==0) {

                    if (money < 10) {
                        System.out.println("Error in transaction!");
                        input = scanner.nextLine();
                    } else {
                        value += money;
                        counterCard++;
                        valueCard += money;
                        System.out.println("Product sold!");
                        input = scanner.nextLine();
                    }
                } else  {

                    if (money  > 100){
                        System.out.println("Error in transaction!");
                } else {
                        value += money;
                        valueCash += money;
                        counterCash++;
                        System.out.println("Product sold!");

                    }


            if (value >= cash) {
                System.out.printf(Locale.US,"Average CS: %.2f%nAverage CC: %.2f", valueCash/counterCash, valueCard/counterCard );
                break;
            }
                    input = scanner.nextLine();
        }}

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }






}}
