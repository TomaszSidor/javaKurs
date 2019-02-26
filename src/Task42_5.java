/**
 * Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia (dla 1 - "poniedziałek",
 * 2 - "wtorek" itp). Dodatkowo wyświetl ile dni zostało do weekendu, dla poniedziałku - 5 dni, wtorku - 4 itp.
 */

public class Task42_5 {
    public static void main(String[] args) {
        int x =8;

        switch (x) {
            case 1:
                System.out.println("poniedziałek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("środa");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piątek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
                default:
                    System.out.println("nie ma takiego numeru");
                    break;
        }
        if (x <=5) {
            System.out.println("Do weekendu zostało " + (6 - x) + " dni");
        } else if (x >5 && x<= 7 ){
            System.out.println("Już weekend !!!");
        }
    }
}
