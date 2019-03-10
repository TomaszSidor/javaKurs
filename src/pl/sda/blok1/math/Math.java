package pl.sda.blok1.math;

public class Math {
    private static final double PI = 3.14;
    private Math(){}

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double divide (int a, int b){
        return a / b;
    }

    public static int min (int a, int b){
        if (a<b){
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
        // return (a < b) ? a : b;
    }

    public static int pow(int a, int b){
        int c = 1;
        for (int i = 1; i <= b; i++) {
            c = c * a;
        }
        return c;
    }

    public static double circle(int r){
        return PI*r*r;
    }

}
