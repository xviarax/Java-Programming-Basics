package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());

        double points = 0;
        double invalidNumbers = 0;
        int numbers09 =0;
        int numbers1019 =0;
        int numbers2029 =0;
        int numbers3039 =0;
        int numbers4050 =0;


        for (int i = 1; i <= moves ; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers >=0 && numbers <=9) {
                points = points + numbers*0.20;
                numbers09 ++;
            }
            if (numbers >=10 && numbers <=19) {
                points = points + numbers*0.30;
                numbers1019++;
            }
            if (numbers >=20 && numbers <=29) {
                points = points + numbers*0.40;
                numbers2029++;
            }
            if (numbers >=30 && numbers <=39) {
                points = points + 50;
                numbers3039++;
            }
            if (numbers >=40 && numbers <=50) {
                points = points + 100;
                numbers4050++;
            }
            if (numbers < 0 || numbers > 50) {
                invalidNumbers ++;
                points = points /2;
            } }
        double percent09 = 100.0 * numbers09/moves;
        double percent1019 = 100.0 * numbers1019/moves;
        double percent2029 = 100.0 * numbers2029/moves;
        double percent3039 = 100.0 * numbers3039/moves;
        double percent4050 = 100.0 * numbers4050/moves;
        double percentInvalid = 100.0 * invalidNumbers/moves;

        System.out.printf(Locale.US,"%.2f%n", points);
        System.out.printf(Locale.US,"From 0 to 9: %.2f%%%n", percent09);
        System.out.printf(Locale.US,"From 10 to 19: %.2f%%%n", percent1019);
        System.out.printf(Locale.US,"From 20 to 29: %.2f%%%n", percent2029);
        System.out.printf(Locale.US,"From 30 to 39: %.2f%%%n", percent3039);
        System.out.printf(Locale.US,"From 40 to 50: %.2f%%%n", percent4050);
        System.out.printf(Locale.US,"Invalid numbers: %.2f%%%n", percentInvalid);




    }
}
