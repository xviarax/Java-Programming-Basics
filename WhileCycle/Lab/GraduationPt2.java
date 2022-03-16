import java.util.Locale;
import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sumGrades = 0;
        double average = 0;
        int fail = 0;
        int level = 0;

        while (level <= 12) {
            double yearGrades = Double.parseDouble(scanner.nextLine());

        sumGrades = sumGrades + yearGrades;

        if (yearGrades < 4) {
            fail++;
        }

        if (fail >= 2) {
            System.out.printf(Locale.US,"%s has been excluded at %d grade", name, level);
            break;
        }
            level++;
        if (level == 12) {
            average = sumGrades/12;
            System.out.printf(Locale.US, "%s graduated. Average grade: %.2f", name, average);
            break;
        }




    }
}}
