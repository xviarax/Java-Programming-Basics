package Exercises;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN = Integer.parseInt(scanner.nextLine());
        int secondN = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = firstN; i <= secondN ; i++) {
            sum = i;
            int even = 0;
            int odd = 0;

            for (int j = 6; j >= 1 ; j--) {
                int digit = sum % 10;

                if (j % 2 == 0) {
                    even = even + digit;
                } else {
                    odd = odd + digit;
                }

                sum = sum / 10;
            }

            if (odd == even){
                System.out.print(i + " ");}


        }

    }
}
