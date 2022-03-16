import java.util.Scanner;
public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());
double price = 0;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    price = number*2.50;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("apple")) {
                    price = number*1.20;
                    System.out.printf("%.2f", price);
                }else if (fruit.equals("orange")) {
                    price = number*0.85;
                    System.out.printf("%.2f", price);
                }else if (fruit.equals("grapefruit")) {
                    price = number*1.45;
                    System.out.printf("%.2f", price);
                }else if (fruit.equals("kiwi")) {
                    price = number*2.70;
                    System.out.printf("%.2f", price);
                }else if (fruit.equals("pineapple")) {
                    price = number*5.50;
                    System.out.printf("%.2f", price);
                }else if (fruit.equals("grapes")) {
                    price = number*3.85;
                    System.out.printf("%.2f", price);
                }else {
                    System.out.println("error");
                }
                break;
                    case "Saturday":
                    case "Sunday":
                        if (fruit.equals("banana")) {
                            price = number*2.70;
                            System.out.printf("%.2f", price);
                        } else if (fruit.equals("apple")) {
                            price = number*1.25;
                            System.out.printf("%.2f", price);
                        }else if (fruit.equals("orange")) {
                            price = number*0.90;
                            System.out.printf("%.2f", price);
                        }else if (fruit.equals("grapefruit")) {
                            price = number*1.60;
                            System.out.printf("%.2f", price);
                        }else if (fruit.equals("kiwi")) {
                            price = number*3.00;
                            System.out.printf("%.2f", price);
                        }else if (fruit.equals("pineapple")) {
                            price = number*5.60;
                            System.out.printf("%.2f", price);
                        }else if (fruit.equals("grapes")) {
                            price = number*4.20;
                            System.out.printf("%.2f", price);
                        } else {
                            System.out.printf("%.2f", price);
                        }
                        break;
            default:
                System.out.println("error");
                break;

                }


        }}





