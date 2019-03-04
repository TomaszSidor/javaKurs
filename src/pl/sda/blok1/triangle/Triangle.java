package pl.sda.blok1.triangle;

public class Triangle {
    public boolean isRectangular(int a, int b, int c){
        int x = a;  //10 4 5
        int y = b;
        int z = c;


        if (a > c){
            z = a;
            x = c;
        }
        // z=8 y = 4 x=5
        else if (b > c){
            z = b;
            y = c;
        }


        return (z*z == y *y + x *x);
    }
}
