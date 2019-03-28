package pl.sda.blok1.exception;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws MyException{

        Scanner scanner = new Scanner(System.in);
        while (true) {

            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");


            int sum = 0;
            for (int i = 0; i < inputArray.length; i++) {
                try {

                    sum = sum + Integer.parseInt(inputArray[i]);

                } catch (java.lang.NumberFormatException nfe) {
                    System.out.println("Podałeś znaki niecyfry");
                }
            }

            System.out.println("Suma = " + sum);

        }

    }
}
