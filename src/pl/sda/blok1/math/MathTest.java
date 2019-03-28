package pl.sda.blok1.math;

import pl.sda.blok1.currency.Operation;

public class MathTest {
    public static void main(String[] args) {
        //Math math = new Math();

        System.out.println("Add: 5 + 25 = " + Math.Operation.add(5,25));
        System.out.println("Minus: 5 - 25 = " + Math.Operation.subtract(5,25));
        System.out.println("Multiply: 5 * 25 = " + Math.Operation.multiply(5,25));
        System.out.println("Divide: 5 / 25 = " + Math.Operation.divide(5, 25));

        System.out.println("Pow = " + Math.Compare.pow(2,6));
        System.out.println("Circle = " + Math.Compare.circle(2));
        System.out.println("Min = " + Math.Compare.min(6, 6));
        System.out.println("Max = " + Math.Compare.max(4, 10));
    }
}
