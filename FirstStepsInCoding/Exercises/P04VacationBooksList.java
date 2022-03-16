package Exercises;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int wholeBook = countPages / pagesPerHour;
        int neededHoursPerDay = wholeBook / days;

        System.out.println(neededHoursPerDay);



    }
}
