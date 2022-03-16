import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        double value = 0;

       while (!destination.equals("End")) {
           double minBudget = Double.parseDouble(scanner.nextLine());
           while (minBudget > value) {
               double n = Double.parseDouble(scanner.nextLine());
                value += n;}

           System.out.printf("Going to %s!%n", destination);
               destination = scanner.nextLine();
               value = 0;
           }






    }
}
