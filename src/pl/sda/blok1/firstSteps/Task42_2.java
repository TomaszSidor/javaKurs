package pl.sda.blok1.firstSteps;

import java.util.Scanner;

/**
 * Napisz program, który wypisze na ekran konsoli, słowo oznaczające ocenę dla podanej cyfry.
 * Np. dla 1 - "niedostateczny", 2 - "mierny" itp. Obsłuż przypadek gdy cyfra jest poza skalą ocen.
 */

public class Task42_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ocenę od 1 do 6: ");
        int x = scanner.nextInt();


        //int x = 7;

        switch (x) {
            case 1:
                System.out.println("niedostateczny"); break;
            case 2:
                System.out.println("mierny"); break;
            case 3:
                System.out.println("dostateczny"); break;
            case 4:
                System.out.println("dobry"); break;
            case 5:
                System.out.println("bardzo dobry"); break;
            case 6:
                System.out.println("celujący"); break;
            default:
                System.out.println("Ocena z poza skali :( "); break;
        }
    }
}
