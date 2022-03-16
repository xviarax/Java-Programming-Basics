package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartament = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50.00;
                apartament = 65.00;
                if (nights > 7 && nights <= 14) {
                    studio = studio * 0.95;
                } else if (nights > 14){
                    studio = studio * 0.7;
                    apartament = apartament * 0.9;}
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartament = 68.70;
                if (nights > 14) {
                studio = studio * 0.8;
                apartament = apartament * 0.9;}
                break;
                case "July":
                case "August":
                studio = 76.00;
                apartament = 77.00;
              if (nights > 14) {
                apartament = apartament * 0.9;
                break;
        }}
        apartament = Math.abs(apartament*nights);
        studio = Math.abs(studio*nights);
            System.out.printf(Locale.US,"Apartment: %.2f lv.%nStudio: %.2f lv.", apartament, studio);
}}
