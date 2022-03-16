import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n ; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (max < value) {
                max = value;}
            if (min > value) {
                min = value;}
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
}}
