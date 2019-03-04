package pl.sda.blok1.arrays;

public class ArraysClass {
    public void showArray (String... newArray){ //String... Varargs (me

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (String i: newArray){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public int plusArray (int... newArray){
        int suma = 0;
        for (int i: newArray){
            suma = suma + (i);
        }
        return suma;
    }
    public int[] evenArray(int count){
        int[] newArray = new int[count];
        int x = 0;
        for (int i = 0; i < count; i++){
            x = x + 2;
            newArray[i] = x;
        }
        return newArray;
    }
    public float[]  doubleArray(float... newArray){
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = newArray[i]*2;
        }
        return newArray;

    }
    public void showTwo (double... newArray){
        System.out.println("Pierwszy " + newArray[0]);
        System.out.println("Ostatni " + newArray[newArray.length - 1]);

        //System.out.println("Srodkowy " + newArray[]);
    }
}
