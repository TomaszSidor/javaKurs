package pl.sda.blok1.arrays;


import java.io.IOException;
import pl.sda.blok1.carStore.Car;
public class ArraysTest {



    public static void main(String[] args) throws IOException {
        ArraysClass newTest = new ArraysClass();

        String[] newArray1 = {"raz", "dwa", "trzy", "cztery"};
        int[] newIntArray = {1, 2, 3, 4, 5};
        float[] newFlowatArray = {123, 223, 455, 333};

        newTest.showArray("raz", "dwa", "trzy", "cztery");
        System.out.println("Suma = " + newTest.plusArray(1, 2, 3, 4, 5));

        int[] evenArray = newTest.evenArray(10);
        for (int i: evenArray){
            System.out.print(i + " ");
        }
        System.out.println();

        //Runtime.getRuntime().exec("cls");

        float[] doubleArray = newTest.doubleArray(123, 223, 455, 333, 987, 9);
        for (float i: newFlowatArray){
            System.out.print(i + " ");
        }
        System.out.println();

        for (float i: doubleArray){
            System.out.print(i + " ");
        }
        System.out.println();

        newTest.showTwo(2, 2, 2, 2, 2, 2);
        Car[] cars = {new Car("toyota", "blue"), new Car("mazda", "silver"), new Car("opel", "czerwony")};




        newTest.showArray(newTest.changePlaces(cars)); //czemu wyświetla adres a nie wyrazy z tablicy





    }
}
