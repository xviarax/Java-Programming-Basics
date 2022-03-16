import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n ; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + value; }

        for (int i = 1; i <= n ; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + value; }

        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else  {
            System.out.println("No, diff = " + Math.abs(leftSum-rightSum) );
        }

    }
}
