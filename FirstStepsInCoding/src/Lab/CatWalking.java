import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutiRazhodka = Integer.parseInt(scanner.nextLine());
        int razhodkiDnevno = Integer.parseInt(scanner.nextLine());
        int kaloriiNaKotaka = Integer.parseInt(scanner.nextLine());

        int sumPerDay = minutiRazhodka * razhodkiDnevno;
        int izgoreniKaloriiNaKotaka = sumPerDay * 5;


    }
}
