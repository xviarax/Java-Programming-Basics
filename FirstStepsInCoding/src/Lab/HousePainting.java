import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double sideWall = x * y;
        double allSides = 2 * sideWall - 2 * 2.25;
        double backWall = x * x;
        double enter = 1.2 * 2;
        double sumFrontBack = 2 * backWall - enter;
        double totalArea = allSides + sumFrontBack;
        double greenPaint = totalArea / 3.4;

        double rectanglesCeil = 2 * ( x * y);
        double twoTriangles = 2 * ( x * h / 2);
        double sumArea = rectanglesCeil + twoTriangles;
        double redPaint = sumArea / 4.3;
        System.out.printf("%.2f%n%.2f", greenPaint, redPaint);




    }
}
