import java.util.Scanner;

public class MinNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String thing =  scanner.nextLine();
            int minN = Integer.MAX_VALUE;

            while (!thing.equals("Stop")) {
                int number = Integer.parseInt(thing);
                if (number < minN) {
                    minN = number;
                }
                thing = scanner.nextLine();

            }
            System.out.println(minN);




        }
    }


