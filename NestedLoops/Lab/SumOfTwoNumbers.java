import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isFound = false;

        for (int f = first; f <= second ; f++) {
            for (int sec = first; sec <= second; sec++) {
                    count++;

                    if (f + sec == magicNumber) {
                    isFound = true;
                        System.out.printf("Combination N:%d (%d + %d = %d)", count, f,sec,magicNumber);
                        break;
                    }}
            if (isFound) {
                break;
            }
        }
            if (!isFound) {
                System.out.printf("%d combinations - neither equals %d", count, magicNumber);
            }





    }
}
