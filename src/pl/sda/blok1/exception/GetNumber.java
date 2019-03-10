package pl.sda.blok1.exception;

import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int number = scanner.nextInt();
            System.out.println(number);
        }
            catch (java.util.InputMismatchException ime){
                System.out.println("POdany znak nie jest liczbą");

        }finally {
            System.out.println("Dzieki to juz koniec");
        }
    }




}
