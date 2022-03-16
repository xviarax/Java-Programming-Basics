package Exercises;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = 10000;
        String home = scanner.nextLine();
        int sum = 0;

        while (!home.equals("Going home")) {
            int stepsNow = Integer.parseInt(home);
            sum = stepsNow + sum;
            if (sum > steps) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", sum-steps);
                break;
            }
            home = scanner.nextLine();
        }

        if (home.equals("Going home")) {
            home = scanner.nextLine();
            int number = Integer.parseInt(home);
            sum = sum + number;
            if (sum > steps){
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", sum-steps);
            } else {
                System.out.printf("%d more steps to reach goal.", steps-sum);
            }
        }



    }
}
