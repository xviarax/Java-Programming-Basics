import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String thing =  scanner.nextLine();
        int maxN = Integer.MIN_VALUE;

        while (!thing.equals("Stop")) {
            int number = Integer.parseInt(thing);
            if (number > maxN) {
                maxN = number;
            }
        thing = scanner.nextLine();

        }
        System.out.println(maxN);




    }
}
