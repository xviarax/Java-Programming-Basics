import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kind = scanner.nextLine();
        double size = Double.parseDouble(scanner.nextLine());


        if (kind.equals("square")) {
            double area = size * size;
            System.out.printf("%.3f", area);
        } else if (kind.equals("rectangle")) {
            double size2 = Double.parseDouble(scanner.nextLine());
            double area = size * size2;
            System.out.printf("%.3f", area);
        } else if (kind.equals("circle")) {
            double area = size * size * Math.PI;
            System.out.printf("%.3f", area);
        } else if (kind.equals("triangle")) {
            double size2 = Double.parseDouble(scanner.nextLine());
            double area = size * size2/2;
            System.out.printf("%.3f", area);
        }

    }
}
