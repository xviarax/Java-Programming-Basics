import java.util.Scanner;
public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        if (number >= 10 && number <= 18) {
            switch (name) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
            System.out.println("open");
            break;
                case "Sunday":
                    System.out.println("closed");
                    break;
    }} else {
            System.out.println("closed");
        }
    }

}
