package Exercises;

import java.util.Scanner;

public class P08FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double smLength = Double.parseDouble(scanner.nextLine());
        double smWidth = Double.parseDouble(scanner.nextLine());
        double smHeight = Double.parseDouble(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double aquariumVolume = smHeight * smLength * smWidth;
        double liters = aquariumVolume * 0.001;
        double percent = percentage * 0.01;
        double neededLiters = liters * (1-percent);

        System.out.printf("%.2f", neededLiters);
    }
}
