package Exercises;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        String input = scanner.nextLine();
        int books = 0;

        while (!input.equals(book)) {
            input = scanner.nextLine();
            books++;
            if (input.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", books);
            break;
            }}

            if (input.equals(book)) {
                System.out.printf("You checked %d books and found it.", books);}






    }
}