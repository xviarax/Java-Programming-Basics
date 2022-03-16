package MoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int treated = 0;
        int untreated = 0;
        int doctors = 7;

        for (int i = 1; i <= period ; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            if(i % 3 == 0 && untreated > treated){
                doctors++;}
            if (value >= doctors ) {
                treated = treated + doctors;
                untreated = untreated + (value - doctors);
            } else {
                treated = treated + value;
                untreated = untreated + 0;}}

            System.out.println("Treated patients: " + treated + ".");
            System.out.println("Untreated patients: "+ untreated + ".");
        }
    }

