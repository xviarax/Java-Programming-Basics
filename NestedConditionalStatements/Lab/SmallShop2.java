import java.util.Scanner;

public class SmallShop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (town.equals("Sofia")) {
            switch (product) {
                case "coffee" -> System.out.println(0.50 * quantity);
                case "water" -> System.out.println(0.80 * quantity);
                case "beer" -> System.out.println(1.20 * quantity);
                case "sweets" -> System.out.println(1.45 * quantity);
                case "peanuts" -> System.out.println(1.60 * quantity);
            }

        } else if (town.equals("Plovdiv")) {
            switch (product) {
                case "coffee" -> System.out.println(0.40 * quantity);
                case "water" -> System.out.println(0.70 * quantity);
                case "beer" -> System.out.println(1.15 * quantity);
                case "sweets" -> System.out.println(1.30 * quantity);
                case "peanuts" -> System.out.println(1.50 * quantity);
            }
        } else if (town.equals("Varna")) {
            switch (product) {
                case "coffee" -> System.out.println(0.45 * quantity);
                case "water" -> System.out.println(0.70 * quantity);
                case "beer" -> System.out.println(1.10 * quantity);
                case "sweets" -> System.out.println(1.35 * quantity);
                case "peanuts" -> System.out.println(1.55 * quantity);
            }
        }}}

