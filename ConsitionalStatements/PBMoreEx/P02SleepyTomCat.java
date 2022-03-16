package PBMoreEx;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        // Работи!
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int breakTime = day * 127;
        int workDays = (365 - day) * 63;
        int mins = Math.abs(30000 - (breakTime+workDays)) % 60;
        int hours = Math.abs(30000 - (breakTime+workDays)) / 60;

        if (30000 >= breakTime + workDays) {
            int over = 30000 - (breakTime + workDays);
            System.out.println("Tom sleeps well");
            System.out.printf("%s hours and %s minutes less for play", hours, mins);
        } else {
            int under = (breakTime+workDays) - 30000;
            System.out.println("Tom will run away");
            System.out.printf("%s hours and %s minutes more for play", hours, mins);
        }


    }
}
