package pl.sda.blok1.arrays;

import pl.sda.blok1.carStore.Car;

import java.util.Arrays;

public class ArraysClass {
    private Car[] car2;


    public void showArray(String... newArray) { //String... Varargs (me

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (String i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int plusArray(int... newArray) {
        int suma = 0;
        for (int i : newArray) {
            suma = suma + (i);
        }
        return suma;
    }

    public int[] evenArray(int count) {
        int[] newArray = new int[count];
        int x = 0;
        for (int i = 0; i < count; i++) {
            x = x + 2;
            newArray[i] = x;
        }
        return newArray;
    }

    public float[] doubleArray(float... newArray) {
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray[i] * 2;
        }
        return newArray;

    }

    public void showTwo(double... newArray) {

        double sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }
        double avr = sum / newArray.length;

        System.out.println("Pierwszy " + newArray[0]);
        if (newArray.length % 2 == 0) {
            System.out.println("Środkowy " + newArray[newArray.length / 2 - 1] + " i " + newArray[newArray.length / 2]);
        } else {
            System.out.println("Środkowy " + newArray[newArray.length / 2]);
        }
        System.out.println("Ostatni " + newArray[newArray.length - 1]);
        System.out.println("Średnia arytmetyczna = " + avr);

    }

    public Car[] changePlaces(Car[] car) {
        car2 = new Car[car.length];
        for (int i = 0; i < car.length; i++) {
            car2[i] = car[car.length - 1 - i];
        }

        return car2;

    }

    public void showArray(Car[]... newArray) { //String... Varargs (me

//        for (int i = 0; i < newArray.length; i++) {
//            System.out.print(newArray[i] + " ");
//        }
        System.out.println();
        for (Car[] i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
