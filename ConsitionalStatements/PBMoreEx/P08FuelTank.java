package PBMoreEx;

import java.util.Locale;
import java.util.Scanner;
public class P08FuelTank {
    public static void main(String[] args) {
        // Работи!
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());

        if (name.equals("Diesel")) {
            if (litres >= 25) {
                System.out.printf("You have enough %s.", name.toLowerCase());
            } else if (litres < 25) {
                System.out.printf("Fill your tank with %s!", name.toLowerCase());
            }
        } else if (name.equals("Gasoline")) {
            if (litres >= 25) {
                System.out.printf("You have enough %s.", name.toLowerCase());
            } else if (litres < 25) {
                System.out.printf("Fill your tank with %s!", name.toLowerCase());
            }
        } else if (name.equals("Gas")) {
            if (litres >= 25) {
                System.out.printf("You have enough %s.", name.toLowerCase());
            } else if (litres < 25) {
                System.out.printf("Fill your tank with %s!", name.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }}

