package Exercises;

import java.util.Scanner;
public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());

        int examTime = (hour * 60) + min;
        int arrivalTime = (arriveHour * 60) + arriveMin;
        int difference = examTime - arrivalTime;

        if (difference > 30){
            System.out.println("Early");

            if (difference > 59){
                int hours = difference / 60;
                int mins = difference % 60;
                System.out.printf("%d:%02d hours before the start", hours, mins);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        } else if (difference < 0){
            System.out.println("Late");
            int minutesLate = Math.abs(difference);
            if (minutesLate > 59){
                int hours = minutesLate / 60;
                int mins = minutesLate % 60;
                System.out.printf("%d:%02d hours after the start", hours, mins);
            } else {
                System.out.printf("%d minutes after the start", minutesLate);
            }
        } else {
            System.out.println("On time");
            if (difference > 0){
                System.out.printf("%d minutes before the start", difference);
            }
        }

    }
}