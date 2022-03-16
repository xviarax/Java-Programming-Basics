import java.util.Locale;
import java.util.Scanner;
public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String roomKind = scanner.nextLine();
        String rate = scanner.nextLine();
double price = 0;
int nights = day -1;
        if (rate.equals("positive")) {
            if (day >= 10 && day <=15) {
                if (roomKind.equals("room for one person")) {
                    System.out.printf(Locale.US, "%.02f", (day * 18) + (day * 18) * 0.25);
                } else if (roomKind.equals("apartment")) {
                    price = (day - 1) * 25 - 0.35*(nights * 25);
                    System.out.printf(Locale.US,"%.02f", price + price * 0.25);
                } else if (roomKind.equals("president apartment")) {
                    price = (day - 1) * 35 - 0.15*(nights * 35);
                    System.out.printf(Locale.US,"%.02f", price + price * 0.25);
                }} else if (day < 10) {
                    if (roomKind.equals("room for one person")) {
                        System.out.printf(Locale.US,"%.02f", ((day - 1) * 18) + (nights * 18) * 0.25);
                    } else if (roomKind.equals("apartment")) {
                        price = (day - 1) * 25 - 0.3*(nights * 25 );
                        System.out.printf(Locale.US,"%.02f", price + price * 0.25);
                    } else if (roomKind.equals("president apartment")) {
                        price = (day - 1) * 35 - 0.1*(nights * 35);
                        System.out.printf(Locale.US,"%.02f", price + price * 0.25);
                    }
                } else {
                    if (roomKind.equals("room for one person")) {
                        System.out.printf(Locale.US,"%.02f", nights * 18 + ((day - 1) * 18) * 0.25);
                    } else if (roomKind.equals("apartment")) {
                        price = nights * 25 - 0.5*(nights * 25);
                        System.out.printf(Locale.US,"%.02f", price + price * 0.25);
                    } else if (roomKind.equals("president apartment")) {
                        price = nights * 35 - 0.2*(nights * 35);
                        System.out.printf(Locale.US,"%.02f", price + price * 0.25);
                    } }

            } else if (rate.equals("negative")) {
            if (day >= 10 && day <=15) {
                if (roomKind.equals("room for one person")) {
                    System.out.printf(Locale.US,"%.02f",(nights*18) - (nights*18) *0.1);
                } else if (roomKind.equals("apartment")) {
                    price = nights * 25 - 0.35*(nights * 25);
                    System.out.printf(Locale.US,"%.02f", price - price*0.1);
                } else if (roomKind.equals("president apartment")) {
                    price = nights* 35 - 0.15*(nights* 35);
                    System.out.printf(Locale.US,"%.02f", price - price*0.1);
                }} else if (day < 10) {
                if (roomKind.equals("room for one person")) {
                    System.out.printf(Locale.US,"%.02f", (nights*18)- (nights*18)*0.1);
                } else if (roomKind.equals("apartment")) {
                    price = nights* 25 - 0.3*(nights* 25);
                    System.out.printf(Locale.US,"%.02f", price - price*0.1);
                } else if (roomKind.equals("president apartment")) {
                    price = nights * 35 - 0.1*(nights * 35);
                    System.out.printf(Locale.US,"%.02f", price - price*0.1);
                }

            } else  {
                if (roomKind.equals("room for one person")) {
                    System.out.printf(Locale.US,"%.02f",(nights*18) - (nights*18) *0.1);
                } else if (roomKind.equals("apartment")) {
                    price =nights* 25 - 0.5*(nights* 25);
                    System.out.printf(Locale.US,"%.02f", price - price*0.1);
                } else if (roomKind.equals("president apartment")) {
                    price = nights * 35 - 0.2*(nights * 35);
                    System.out.printf(Locale.US,"%.02f", price - price*0.1);
        }
}}}}
