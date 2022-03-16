package Exercises;
import java.util.Locale;
import java.util.Scanner;
public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int operation =0;

        switch (operator) {
            case "+":
            operation = n1 + n2;
             if (operation % 2 == 0) {
                System.out.printf(Locale.US,"%d + %d = %d - even", n1, n2, operation);
        } else {
                 System.out.printf(Locale.US,"%d + %d = %d - odd", n1, n2 ,operation);
             }
             break;
            case "-":
                operation = n1 - n2;
                if (operation % 2 == 0) {
                    System.out.printf(Locale.US,"%d - %d = %d - even", n1, n2, operation);
                } else {
                    System.out.printf(Locale.US,"%d - %d = %d - odd", n1, n2, operation);
                }
                break;
            case "*":
                operation = n1 * n2;
                if (operation % 2 == 0) {
                    System.out.printf(Locale.US,"%d * %d = %d - even", n1, n2, operation);
                } else {
                    System.out.printf(Locale.US,"%d * %d = %d - odd", n1, n2, operation);
                }
                break;
            case "/":

                    if (n2 != 0) {
                     double oper = n1*1.0 / n2;
                        System.out.printf(Locale.US, "%d / %d = %.2f", n1, n2, oper);
                    } else {
                        System.out.printf(Locale.US,"Cannot divide %d by zero", n1);
                    }
                break;
            case "%":
                if (n2 != 0) {
                    operation = n1 % n2;
                    System.out.printf(Locale.US,"%d %% %d = %d", n1,n2, operation);
                } else {
                    System.out.printf(Locale.US,"Cannot divide %d by zero", n1);
                }
                    break;

        }

}}
