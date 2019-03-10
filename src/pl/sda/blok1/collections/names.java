package pl.sda.blok1.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class names {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> names = new HashSet<>();

        while (true) {
            System.out.print(">>> ");
            String input = scanner.nextLine();
            names.add(input);

            if ("q".equalsIgnoreCase(input)) {
                break;
            }

        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
