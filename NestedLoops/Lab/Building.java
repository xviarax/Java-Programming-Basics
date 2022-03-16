import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >= 1 ; i--) {
            for (int room = 0; room < rooms ; room++) {
                if (i == floors) {
                    System.out.printf("L%d%d ", i, room);
                } else if (i % 2 == 0 ) {
                System.out.printf("O%d%d ",i,room);
            } else if (i % 2 == 1){
                System.out.printf("A%d%d ", i, room);
            }

            }
            System.out.println();
        }




    }
}
