import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int pencils = Integer.parseInt(scanner.nextLine());
         int markeri = Integer.parseInt(scanner.nextLine());
         double litrineshto = Double.parseDouble(scanner.nextLine());
         int procentNamalenie = Integer.parseInt(scanner.nextLine());

         double pricePencils = pencils * 5.80;
         double priceMarkeri = markeri * 7.20;
         double pricePreparat = litrineshto * 1.20;
         double sumAll = priceMarkeri + pricePreparat + pricePencils;
         double discount = sumAll - (sumAll * procentNamalenie * 0.01);

        System.out.printf("%.3f", discount);

    }
}
