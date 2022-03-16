package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacitet = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;
        int v = 0;
        int g = 0;

        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;
            } }

        double percentA = 100.0 * a / fans;
        double percentB = 100.0 * b / fans;
        double percentV = 100.0 * v / fans;
        double percentG = 100.0 * g / fans;
        double percentAll = 100.0 * fans / capacitet;

        System.out.printf(Locale.US,"%.2f%%%n", percentA);
        System.out.printf(Locale.US,"%.2f%%%n", percentB);
        System.out.printf(Locale.US,"%.2f%%%n", percentV);
        System.out.printf(Locale.US,"%.2f%%%n", percentG);
        System.out.printf(Locale.US,"%.2f%%%n", percentAll);


    }
}
