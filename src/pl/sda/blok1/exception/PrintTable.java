package pl.sda.blok1.exception;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
        try{
            System.out.println(fruits[index]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Index poza tablicą");
        } finally {
            System.out.println("Dzieki to juz koniec");
        }

    }
}
