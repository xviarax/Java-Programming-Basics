import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double pricePeralnq = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        double giftMoney = 0;
        double giftToy = 0;
        double sum = 0;
        int takenMoney = 0;

        for (int i = 1; i <= age ; i++) {
            if (i % 2 ==0) {
            giftMoney += 5 * i;
            takenMoney ++;
            } else {
                giftToy = giftToy + 1;
            }
        }
        double priceToys = giftToy * priceToy;
        sum = (priceToys + giftMoney) - takenMoney ;
        double left = Math.abs(sum - pricePeralnq);
        if (sum >= pricePeralnq) {
            System.out.printf("Yes! %.2f", left);
        } else {
            System.out.printf("No! %.2f", left);
        }



    }
}
