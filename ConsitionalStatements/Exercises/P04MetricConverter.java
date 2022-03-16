package Exercises;

import java.util.Scanner;

public class P04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        String convert = scanner.nextLine();
        double result = 0;

        if (name.equals("mm")) {
            if (convert.equals("cm")) {
                result = number * 0.1;
            } else {
                result = number * 0.001;
            }
        } else if (name.equals("cm")) {
            if (convert.equals("mm")) {
               result = number * 10;
            } else {
                result = number / 100;
            }
        } else {
            if (convert.equals("mm")) {
                result = number * 1000;
            } else {
               result = number * 100;
            }
        }
        System.out.printf("%.3f", result);

    }
}
