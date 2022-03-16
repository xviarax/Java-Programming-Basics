import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        //1. име (текст) -> конзолата
        //2. печатам: Hello, <име>!
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
            }
}
