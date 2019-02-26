import java.util.Scanner;

public class Task42_1 {

    public static void checkNumber(int x) {


        if (x < 0) {
            System.out.println(" X = " + x + " jest mniejsze od 0");
        } else if (x <= 10) {
            System.out.println(" przedział 1 - 10 ");
        } else if (x <= 100) {
            System.out.println(" przedział 11 - 100 ");
        } else if (x <= 1000) {
            System.out.println(" przedział 101 - 1000 ");
        } else if (x <= 10000) {
            System.out.println(" przedział 1001 - 10000 ");
        } else
            System.out.println(" przedział powyzej 100000");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        int x = scanner.nextInt();
        checkNumber(x);



//        int x = 15;
//
//        checkNumber(10);
//        checkNumber(15);
//        checkNumber(59787);
//        checkNumber(84747696);
//        checkNumber(-1);


    }
}
