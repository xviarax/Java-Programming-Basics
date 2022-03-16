import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int sum = 0;
        int freeSpace = width*length*height;


        while (!input.equals("Done")) {
        int boxCount = Integer.parseInt(input);
        sum = sum + boxCount;
            if (freeSpace < sum) {
                int needed = Math.abs(freeSpace - sum);
                System.out.printf("No more free space! You need %d Cubic meters more.", needed);
                break;
            }


        input  = scanner.nextLine();

        }

        if (sum <= freeSpace) {
            int left = freeSpace - sum;
            System.out.printf("%d Cubic meters left.", left);
        }
}}
