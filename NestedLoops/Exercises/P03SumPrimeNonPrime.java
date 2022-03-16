package Exercises;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String command = scanner.nextLine();
       int primeN = 0;
       int nonPrimeN = 0;

       while (!command.equals("stop")) {
           int n = Integer.parseInt(command);
           if (n < 0) {
               System.out.println("Number is negative.");

           } else {
               if (n == 2) {
                   primeN = primeN + n;
               } else {
                   if (n % 2 == 0 || n % 3 == 0 && n > 5) {
                       nonPrimeN = n + nonPrimeN;
                   } else {
                       primeN = primeN + n;
                   }
               }
           }
           command = scanner.nextLine();
       }
        System.out.printf("Sum of all prime numbers is: %d%n", primeN);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeN);







    }
}
