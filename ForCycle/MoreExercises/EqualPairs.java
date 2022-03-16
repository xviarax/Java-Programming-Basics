package MoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int value = 0;
        int lastValue = 0;
        int counter = 0;
        int maxDiff = 0;

        for (int i = 1; i <= n; i++) {
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());

            value = n1 + n2;

            if (value == lastValue) {
                counter++;
            }
            if (maxDiff < Math.abs(lastValue - value) && i >=2) {
                maxDiff = Math.abs(lastValue - value);
            }
            if (value != lastValue) {
                lastValue = value;
            }
        }
        if (counter == n - 1) {
            System.out.println("Yes, value=" + value);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}




