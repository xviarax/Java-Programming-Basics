package PBMoreEx;
import java.util.Scanner;
public class P06Pets {
    // Работи!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int kgFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine());

        double neededFoodDog = days * dogFoodPerDay;
        double neededFoodCat = days * catFoodPerDay;
        double neededFoodTurtle = days * turtleFoodPerDay/ 1000.0;
        double sum = neededFoodCat + neededFoodDog + neededFoodTurtle;

        if (sum > kgFood) {
            double left = Math.ceil(sum - kgFood);
            System.out.printf("%.0f more kilos of food are needed.", left);
        } else if (kgFood >= sum ){
            double left = Math.floor(kgFood - sum);
            System.out.printf("%.0f kilos of food left.", left);
        }

    }
}
