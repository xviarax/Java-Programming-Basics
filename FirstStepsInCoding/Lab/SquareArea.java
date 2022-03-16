import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        //1. страна на квадрата (цяло число) -> конзолата
        //2. пресмятаме лицето на квадрата
        //3. принтирам лицето на квадрата
        Scanner scanner = new Scanner(System.in);
        int squareSide = Integer.parseInt(scanner.nextLine());
        int area = squareSide * squareSide;
        System.out.println(area);
    }
}


