import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        Double deskRows = Math.floor(( w * 100) /120);
        Double deskNumber = Math.floor(((h * 100) - 100)  / 70);
        int allDeskPlace = (int) ((deskRows * deskNumber) - 3);
        System.out.println(allDeskPlace);


    }
}
