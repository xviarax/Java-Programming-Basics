package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());

        double sumElectr = 0;
        double water = months * 20;
        double internet = months * 15;
        double value = 0;


        for (int i = 1; i <= months ; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            sumElectr = sumElectr + electricity;
            double others = (20+15+electricity) + (20+15+electricity)*0.2;
            value = value + others;
        }
        double average = (sumElectr+water+internet+value)/months;

        System.out.printf(Locale.US,"Electricity: %.2f lv%n", sumElectr);
        System.out.printf(Locale.US,"Water: %.2f lv%n", water);
        System.out.printf(Locale.US,"Internet: %.2f lv%n", internet);
        System.out.printf(Locale.US,"Other: %.2f lv%n", value);
        System.out.printf(Locale.US,"Average: %.2f lv%n", average);




    }
}
