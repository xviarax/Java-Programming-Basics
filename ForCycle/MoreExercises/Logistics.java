package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tovari = Integer.parseInt(scanner.nextLine());

        double average = 0;
        double mikrobus = 0;
        double truck = 0;
        double train = 0;

        double priceTrain = 0;
        double priceTruck = 0;
        double priceMikrobus = 0;
        double sum = 0;

        for (int i = 1; i <= tovari ; i++) {
           int tonaj = Integer.parseInt(scanner.nextLine());
            sum = sum + tonaj;

            if (tonaj <= 3) {
                priceMikrobus += tonaj * 200;
                mikrobus += tonaj;
            }
            if (tonaj >= 4 && tonaj <= 11) {
                priceTruck += tonaj * 175;
                truck += tonaj;

            }
            if (tonaj > 11){
                priceTrain += tonaj * 120;
                train += tonaj;
            }}

        average = (priceTrain+priceTruck+priceMikrobus) / sum;
        double percentMikro = mikrobus / sum *100;
        double percentTruck = truck / sum *100;
        double percentTrain = train / sum *100;

        System.out.printf(Locale.US,"%.2f%n", average);
        System.out.printf(Locale.US,"%.2f%%%n", percentMikro);
        System.out.printf(Locale.US,"%.2f%%%n", percentTruck);
        System.out.printf(Locale.US,"%.2f%%%n",percentTrain);

    }
}
