package Exercises;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double interest = deposit * interestRate / 100.0;
        double interestPerMonth = interest / 12;

         double sum = deposit + (months * interestPerMonth);
        System.out.println(sum);


    }
}
