import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double greenMeters = Double.parseDouble(scanner.nextLine());
        double priceGreening = greenMeters * 7.61;
        double discount = priceGreening * 0.18;
        double result = priceGreening - discount;

        System.out.println("The final price is: " + result + " lv.");
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
