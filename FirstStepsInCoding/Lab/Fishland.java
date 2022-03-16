import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double priceSkumriq = Double.parseDouble(scanner.nextLine());
        Double priceCaca = Double.parseDouble(scanner.nextLine());
        Double kgPalamud = Double.parseDouble(scanner.nextLine());
        Double kgSafrid = Double.parseDouble(scanner.nextLine());
        Double kgMidi = Double.parseDouble(scanner.nextLine());

        Double pricePalamud =  priceSkumriq + priceSkumriq * 0.60;
        Double sumPalamud = kgPalamud * pricePalamud;
        Double priceSafrid = priceCaca + priceCaca * 0.80;
        Double sumSafrid = kgSafrid * priceSafrid;
        Double sumMidi = kgMidi * 7.50;
        Double check = sumPalamud + sumSafrid +sumMidi;
        System.out.printf("%.2f", check);

    }
}
