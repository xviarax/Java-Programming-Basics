import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        //1. инчове (реално число) -> конзолата
        //2. преобразувам инчове в см -> см = инчове * 2.54
        //3. печатаме см
            Scanner scanner = new Scanner(System.in);
            double inches = Double.parseDouble(scanner.nextLine());
            double sm = inches * 2.54;
            System.out.println(sm);


    }
}
