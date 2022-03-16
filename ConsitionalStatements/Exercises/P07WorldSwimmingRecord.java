package Exercises;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceMetres = Double.parseDouble(scanner.nextLine());
        double swimmingTime = Double.parseDouble(scanner.nextLine());

        double sec = distanceMetres * swimmingTime;
        double slower = Math.floor(distanceMetres / 15) *12.5;
        double sumTime = sec + slower;

        if (sumTime >= recordInSec) {
            double result = sumTime - recordInSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.", result);
        } else {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sumTime);
        }

    }
}
