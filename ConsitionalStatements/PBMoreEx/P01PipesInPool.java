package PBMoreEx;

import java.util.Locale;
import java.util.Scanner;

public class P01PipesInPool {
    // Работи!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());

        double fullP1 = p1 * h;
        double fullP2 = p2 * h;
        double sum = fullP1 + fullP2;

            if (sum <= v) {
            double percentFull = sum / v * 100;
            double pipe1 = fullP1 / sum * 100;
            double pipe2 = fullP2 / sum * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentFull, pipe1, pipe2);
        } else {
            double overflow = sum - v;
            System.out.printf(Locale.US,"For %.2f hours the pool overflows with %.2f liters.", h, overflow);
        }
    }}


