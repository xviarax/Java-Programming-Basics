package Exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        double totalSumGrades = 0;
        int countGrades = 0;

        while (!input.equals("Finish")) {
            String presentationName = input;

            double sumCurrentGrades = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countGrades++;
                sumCurrentGrades = sumCurrentGrades + grade;
            }
            totalSumGrades = totalSumGrades + sumCurrentGrades;

            System.out.printf("%s - %.2f.%n", presentationName, sumCurrentGrades / n);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.%n", totalSumGrades / countGrades);
    }
}