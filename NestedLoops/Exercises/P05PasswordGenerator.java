package Exercises;

import java.util.Scanner;

public class P05PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        //11aa2
        //Символ 1: цифра от 1 до n.
        //Символ 2: цифра от 1 до n.
        //Символ 3: малка буква измежду първите l букви на латинската азбука.//4
        //Символ 4: малка буква измежду първите l букви на латинската азбука.
        //Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n ; j++) {
                for (int k = 97; k < 97 + l; k++) {
                    for (int m = 'a'; m < 'a' + l; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                            }
                        }
                    }
                }
            }
        }
    }
}