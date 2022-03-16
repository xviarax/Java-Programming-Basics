package Exercises;

import java.util.Scanner;

public class P05TimeAnd15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int sum = (hour*60) + min + 15;
        int hour1 = sum / 60;
        int min1 = sum % 60;

        if (hour1 < 24) {
            System.out.printf("%d:%02d", hour1, min1);
        } else {
            hour1 = 0;
            System.out.printf("%d:%02d", hour1, min1);

        }

    }
}
