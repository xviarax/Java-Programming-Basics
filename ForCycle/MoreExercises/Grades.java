package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());


        int countPoor = 0;
        int countAverage = 0;
        int countGood = 0;
        int countExcellent = 0;

        double value = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            value = value + grade;
            if (grade >= 2 && grade <= 2.99) {
                countPoor ++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                countAverage ++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                countGood ++;
            } else if (grade >= 5.00 ) {
                countExcellent ++;
            }
        }
        double percentPoor = 100.0 * countPoor / students;
        double percentAverage = 100.0 * countAverage / students;
        double percentGood = 100.0 * countGood / students;
        double percentExcellent = 100.0 * countExcellent / students;
        double average = value / students;

        System.out.printf(Locale.US,"Top students: %.2f%%%n", percentExcellent);
        System.out.printf(Locale.US,"Between 4.00 and 4.99: %.2f%%%n", percentGood);
        System.out.printf(Locale.US,"Between 3.00 and 3.99: %.2f%%%n", percentAverage);
        System.out.printf(Locale.US,"Fail: %.2f%%%n", percentPoor);
        System.out.printf(Locale.US,"Average: %.2f", average);


    }
}
