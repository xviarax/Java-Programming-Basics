import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinaBullshit = Double.parseDouble(scanner.nextLine());
        double comission = Double.parseDouble(scanner.nextLine());

        double bitToBgn = bitcoin * 1168.0;
        double chinaToDollars = chinaBullshit * 0.15;
        double dollarsToBgn = chinaToDollars * 1.76;

        double leva = bitToBgn + dollarsToBgn;
        double euro = leva / 1.95;
        double comisssion = euro * comission * 0.01;
        double sum = euro - comisssion;

        System.out.printf("%.2f", sum);

    }
}
