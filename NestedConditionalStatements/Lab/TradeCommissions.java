import java.util.Locale;
import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());
        double comission = 0;

        if ( number < 0 ) {
            System.out.println("error");
        } else if (number<=500) {
            if (town.equals("Sofia")) {
                comission = number * 0.05;
                System.out.printf(Locale.US,"%.2f", comission);
            } else if (town.equals("Varna")) {
                comission = number * 0.045;
                System.out.printf(Locale.US,"%.2f", comission);
            } else if (town.equals("Plovdiv")) {
                comission = number * 0.055;
                System.out.printf(Locale.US,"%.2f", comission);
            } else {
                System.out.println("error");
        } } else if (number > 500 && number <=1000) {
            if (town.equals("Sofia")) {
                comission = number * 0.07;
                System.out.printf(Locale.US,"%.2f", comission);
            } else if (town.equals("Varna")) {
                comission = number * 0.075;
                System.out.printf(Locale.US,"%.2f", comission);
            } else if (town.equals("Plovdiv")) {
                comission = number * 0.08;
                System.out.printf(Locale.US,"%.2f", comission);
            } else {
                System.out.println("error");
            }
        } else if (number > 1000 && number <=10000) {
            if (town.equals("Sofia")) {
                comission = number * 0.08;
                System.out.printf(Locale.US,"%.2f", comission);
            } else if (town.equals("Varna")) {
                comission = number * 0.1;
                System.out.printf(Locale.US,"%.2f", comission);
            } else if (town.equals("Plovdiv")) {
                comission = number * 0.12;
                System.out.printf(Locale.US,"%.2f", comission);
            } else {
                System.out.println("error");
            }
    } else if (number > 10000 ){
            if (town.equals("Sofia")) {
                comission = number * 0.12;
                System.out.printf(Locale.US,"%.2f", comission);
            } else if (town.equals("Varna")) {
                comission = number * 0.13;
                System.out.printf(Locale.US,"%.2f", comission);
            } else if (town.equals("Plovdiv")) {
                comission = number * 0.145;
                System.out.printf(Locale.US,"%.2f", comission);
            } else {
                System.out.println("error");
            }
}
    }}
