package Exercises;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int currentNumber = 0;

        for (int rows = 1 ; rows <= n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
            currentNumber ++;
             if (currentNumber > n) {
                 break;
             }
                System.out.printf("%d ", currentNumber);

            }
            if (currentNumber > n) {
                break;
            }
            System.out.println();

        }

    }
}
