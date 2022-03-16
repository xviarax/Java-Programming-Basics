package Exercises;
import java.util.Locale;
import java.util.Scanner;
public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double rosePrice = 5.00;
        double dalia = 3.80;
        double lale = 2.80;
        double narcis = 3.00;
        double gladiola = 2.50;
        double price = 0;
        double finalprice=0;


        if (flower.equals("Roses")) {
            price = flowerCount * rosePrice;
            if (flowerCount > 80) {
             finalprice = price - price * 0.10;
            } else {
             finalprice = flowerCount * rosePrice;
            }

        } else if (flower.equals("Dahlias")) {
            price = flowerCount * dalia;
            if (flowerCount > 90) {
              finalprice = price - price * 0.15;
            } else {
               finalprice = flowerCount * dalia;
            }

        } else if (flower.equals("Tulips")) {
            price = (flowerCount * lale);
            if (flowerCount > 80) {
               finalprice = price - price * 0.15;
            } else {
               finalprice = flowerCount * lale;
            }

        }  else if (flower.equals("Narcissus")) {
                    price = flowerCount * narcis;
                    if (flowerCount < 120) {
                    finalprice = price + price*0.15;
                    } else {
                    finalprice = flowerCount * narcis; }

        } else if (flower.equals("Gladiolus")) {
            price = flowerCount * gladiola;
            if (flowerCount < 80) {
                finalprice = price + price * 0.20;
            } else {
                finalprice = flowerCount * gladiola;
            }
        }
        if (finalprice > budget) {
                            double left = finalprice - budget;
                            System.out.printf(Locale.US,"Not enough money, you need %.2f leva more.", left);
                        } else {
                            double left = (budget - finalprice);
                            System.out.printf(Locale.US, "Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flower, left);
                        }
}}
