package Exercises;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grades = Integer.parseInt(scanner.nextLine());
        String exercise = scanner.nextLine();
        int failGrades = 0;
        int countGrades = 0;
        double sum = 0;
        int ex = 0;
        String lastproblem = "";

        while (!exercise.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            countGrades++;
            sum = sum + grade;
            if (grade <= 4 ) {
                failGrades++;
            }
           ex++;
            if (failGrades >= grades) {
                System.out.printf("You need a break, %d poor grades.", failGrades);
                break;
            }
            lastproblem = exercise;
            exercise = scanner.nextLine();

        }
        double average = sum / countGrades;
        if (exercise.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", ex);
            System.out.printf("Last problem: %s", lastproblem );
        }




    }
}
