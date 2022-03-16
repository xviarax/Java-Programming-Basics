package Exercises;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n ; i++) {
        int currentNumber = Integer.parseInt(scanner.nextLine());
        sum = sum + currentNumber;
        if (maxNumber < currentNumber){
            maxNumber = currentNumber;
        }
        }
        sum = sum - maxNumber;
        if (sum == maxNumber) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(maxNumber - sum));
        }

    }

}
