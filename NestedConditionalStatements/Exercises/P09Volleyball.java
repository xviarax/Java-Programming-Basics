package Exercises;

import java.util.Scanner;

public class P09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int weekendsSofia = 48 - h;
        double saturdaysGame = weekendsSofia * 0.75;
        double holidaysGame = p * (2/3.0);
        double totalGames = saturdaysGame + holidaysGame + h;

        if (year.equals("leap")) {
        double extraGames = Math.floor(totalGames + totalGames*0.15);
            System.out.printf("%.0f",Math.floor(extraGames));
        } else {

            System.out.printf("%.0f",Math.floor(totalGames));
        }
    }
}
