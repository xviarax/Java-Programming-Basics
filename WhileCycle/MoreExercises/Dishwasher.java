package MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPreparat = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int preparat = countPreparat * 750;
        int value = 0;
        int pots = 0;
        int counter = 0;


        while (!input.equals("End")) {
          int sudove = Integer.parseInt(input);
        counter++;
            if (counter % 3 ==0) {
                pots += sudove;
                preparat = preparat - (sudove * 15);

            } else {
                preparat = preparat - (sudove * 5);
                value += sudove;
            }


            if (preparat < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(preparat));
                break;
            }
            input = scanner.nextLine();
        }

            if (input.equals("End")) {
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.", value, pots, preparat);
        }




    }
}
