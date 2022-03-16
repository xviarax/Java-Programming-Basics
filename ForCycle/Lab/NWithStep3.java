import java.util.Scanner;

public class NWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        for (int i = 1; i <= n; i+= 3) {
            System.out.println(i);
        }

    }
}
