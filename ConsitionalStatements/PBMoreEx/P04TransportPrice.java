package PBMoreEx;
import java.util.Locale;
import java.util.Scanner;
public class P04TransportPrice {
    public static void main(String[] args) {
        //Работи!
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double taxi = 0;
        double bus = 0.09 * n;
        double train = 0.06 * n;

        if (name.equals("day")) {
            taxi = 0.70 + n * 0.79;
        } else if (name.equals("night")) {
            taxi = 0.70 + n * 0.90;
        }
        if (n < 20) {
                System.out.printf(Locale.US,"%.2f", taxi);

        } else if (n >= 100) {
            System.out.printf(Locale.US,"%.2f", train);
            } else {
            System.out.printf(Locale.US,"%.2f", bus);
            }





    }}

