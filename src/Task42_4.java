/**
 * Napisz program, który wypisze na ekran konsoli czy podany kod Unicode jest liczbą (0-9),
 * małą literą (a-z) czy też dużą literą (A-Z). Kody każdej z grup znaków następują po sobie
 * więc wystarczy znaleźć kod np. dla litery 'a' i 'z' i sprawdzić czy podany kod zawiera się w tym przedziale.
 */

public class Task42_4 {
    public static void main(String[] args) {
        char x = 72;

        if (x >= (int)'A' && x <= (int)'Z'){
            System.out.println("Znak " + x + " jest wielką literą.");
        }
        else if (x >= (int)'a' && x <= (int)'z') {
            System.out.println("Znak " + x + " jest małą literą.");
        }
        else if (x >= (int)'0' && x <= (int)'9') {
            System.out.println("Znak " + x + " jest cyfrą.");
        }
    }
}
