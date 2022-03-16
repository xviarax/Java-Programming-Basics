import java.util.Locale;
import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String thing = scanner.nextLine();
        double totalSum = 0;

        while (!thing.equals("NoMoreMoney")) {
            double money = Double.parseDouble(thing);
            if (money < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf(Locale.US,"Increase: %.2f%n", money);
            totalSum = totalSum + money;
            thing = scanner.nextLine();
        }
        System.out.printf(Locale.US,"Total: %.2f", totalSum );



    }
}
