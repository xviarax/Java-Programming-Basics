import java.util.Locale;
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();


        double full = 0;
        int standart = 0;
        int student = 0;
        int kid = 0;
        int ticketsBuyed = 0;

        while (!movie.equals("Finish")) {
            int availableSeats = Integer.parseInt(scanner.nextLine());

            while (true) {
                String ticket = scanner.nextLine();
            if (ticket.equals("End")) {
                break;
            }
                if (ticket.equals("student")) {
                    student++;
                } else if (ticket.equals("standard")) {
                    standart++;
                } else if (ticket.equals("kid")){
                    kid++;
                }

            ticketsBuyed ++;

            if (ticketsBuyed >= availableSeats) {
                break;
            }

        }
            full = ticketsBuyed * 1.0/availableSeats * 100;
            System.out.printf(Locale.US,"%s - %.2f%% full.%n", movie, full);

        movie = scanner.nextLine(); }
        standart = standart / ticketsBuyed * 100;
        student = student / ticketsBuyed * 100;
        kid = kid / ticketsBuyed * 100;

        System.out.printf("Total tickets: %.0f", ticketsBuyed);

        System.out.printf("%.2f%% student tickets%n%.2f%% standart tickets%n%.2f%% kids tickets", student,standart,kid);


    }
}
