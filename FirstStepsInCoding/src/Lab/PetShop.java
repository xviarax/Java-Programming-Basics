import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogCount = Integer.parseInt(scanner.nextLine());
        int otherDogs = Integer.parseInt(scanner.nextLine());

        double sum = dogCount * 2.50 + otherDogs * 4;

        System.out.printf("%.1f lv.", sum);
    }
}
