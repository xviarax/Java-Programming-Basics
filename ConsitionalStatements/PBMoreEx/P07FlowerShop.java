package PBMoreEx;

import java.util.Scanner;
// Работи!

public class P07FlowerShop {
    public static void main(String[] args) {
        double magnolii = 3.25;
        double ziumbiuli = 4.00;
        double rozi = 3.50;
        double kaktusi = 8.00;
        Scanner scanner = new Scanner(System.in);
        int countMagnolii = Integer.parseInt(scanner.nextLine());
        int countZiumbiuli = Integer.parseInt(scanner.nextLine());
        int countRozi = Integer.parseInt(scanner.nextLine());
        int countKaktusi = Integer.parseInt(scanner.nextLine());
        double priceOfGift = Double.parseDouble(scanner.nextLine());
        double sum = (magnolii*countMagnolii + ziumbiuli*countZiumbiuli + rozi*countRozi + kaktusi*countKaktusi);
        double danuci = sum*0.05;
        double win = sum - danuci;
        if (win >= priceOfGift) {
            double left = Math.floor(win - priceOfGift);
            System.out.printf("She is left with %.0f leva.", left);
        } else {
            double left = Math.ceil(priceOfGift - win);
            System.out.printf("She will have to borrow %.0f leva.", left);
        }

    }
}
