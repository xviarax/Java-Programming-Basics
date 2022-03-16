package MoreExercises;

import java.util.Locale;
import java.util.Scanner;
public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());

            if (x >= 0) {
            System.out.printf("Result: %.2f%n", x * 2);
        } else {
            System.out.println("Negative number!");
        }
            while ( x >= 0) {
                x = Double.parseDouble(scanner.nextLine());
                if (x >= 0) {
                    System.out.printf(Locale.US,"Result: %.2f%n", x * 2);
                } else {
                    System.out.println("Negative number!");
                }
            }
    }
}
