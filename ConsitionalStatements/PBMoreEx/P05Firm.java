package PBMoreEx;

import java.util.Scanner;

public class P05Firm {
    // Работи!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double hoursForWorking = (days - days*0.1) * 8;
        double workersWorkingExtraordinary = Math.floor(workers * (2* days));
        double sumHours =  Math.floor(hoursForWorking + workersWorkingExtraordinary);

        if (sumHours >= hours) {
            double left = sumHours - hours;
            System.out.printf("Yes!%.0f hours left.", left);
        } else {
            double left = hours - sumHours;
            System.out.printf("Not enough time!%.0f hours needed.", left);
        }

    }
}
