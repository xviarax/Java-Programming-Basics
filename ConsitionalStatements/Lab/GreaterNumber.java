import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        if (first > second) {
            System.out.println(first);
        } else  {
            System.out.println(second);
        }
    }
}
