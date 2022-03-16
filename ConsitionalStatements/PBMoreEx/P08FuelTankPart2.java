package PBMoreEx;
import java.util.Scanner;
public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        String yesOrNo = scanner.nextLine();
        double price = 0;

        if (yesOrNo.equals("Yes")){
            switch (name) {
                case "Diesel":
                    price = litres * (2.33 - 0.12);
                    break;
                case "Gasoline":
                    price = litres * (2.22 - 0.18);
                    break;
                case "Gas":
                    price = litres * (0.93 - 0.08);
                    break;
            }
        } else if (yesOrNo.equals("No")) {
            switch (name) {
                case "Diesel":
                    price = litres * 2.33;
                    break;
                case "Gasoline":
                    price = litres * 2.22;
                    break;
                case "Gas":
                    price = litres * 0.93;
                    break;

            }

        } if (litres >= 20 && litres <=25){
            price*=0.92;
            System.out.printf("%.2f lv.",price);
        }else if (litres >25){
            price*=0.90;
            System.out.printf("%.2f lv.",price);
        }else {
            System.out.printf("%.2f lv.",price);
        }
    }
}