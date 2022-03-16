package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class P03OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;


        for (int i = 1; i <= n ; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0){
                oddSum = oddSum + currentNumber;
                if (oddMin > currentNumber) {
                    oddMin = currentNumber;
                }
                if (oddMax < currentNumber) {
                    oddMax = currentNumber;
                }

            } else {
                evenSum = evenSum + currentNumber;
                if (evenMin > currentNumber) {
                    evenMin = currentNumber;
                }
                if (evenMax < currentNumber) {
                    evenMax = currentNumber;
                }
            }
            if (currentNumber == 0){
                break;
            }
        }


        System.out.printf(Locale.US,"OddSum=%.2f,%n", oddSum);
        if (oddMin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
        System.out.printf(Locale.US,"OddMin=%.2f,%n", oddMin); }
        if (oddMax == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
        System.out.printf(Locale.US,"OddMax=%.2f,%n", oddMax); }
        System.out.printf(Locale.US,"EvenSum=%.2f,%n", evenSum);
        if (evenMin == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else  {
        System.out.printf(Locale.US,"EvenMin=%.2f,%n", evenMin); }
        if (evenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
        System.out.printf(Locale.US,"EvenMax=%.2f%n", evenMax);}



    }
}
