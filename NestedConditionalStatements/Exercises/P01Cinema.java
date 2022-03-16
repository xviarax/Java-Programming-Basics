package Exercises;
import java.util.Locale;
import java.util.Scanner;
public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectType = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (projectType) {
            case "Premiere":
                price = 12.00 * r * c;
                System.out.printf(Locale.US,"%.2f leva", price);
                break;
                case "Normal":
                price = 7.50 * r * c;
                    System.out.printf(Locale.US,"%.2f leva", price);
                break;
                case "Discount":
                price = 5.00 * r * c;
                    System.out.printf(Locale.US,"%.2f leva", price);
                break;




    }
}}
