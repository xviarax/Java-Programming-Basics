package Exercises;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countPieceCake = width*length;

        while (!input.equals("STOP")) {
            int n = Integer.parseInt(input);
            countPieceCake -= n;

            if (countPieceCake < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieceCake));
                break; }
            input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", countPieceCake);
           }








        }
    }

