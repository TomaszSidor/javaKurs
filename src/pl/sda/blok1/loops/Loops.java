package pl.sda.blok1.loops;

public class Loops {
    public void showN (int n){
        int x = 2;
        for (int i = 0; i < n; i++){
            System.out.print(x + " ");
            x = x+2;
        }
        System.out.println();
    }




    public void powerN (int a, int n){
        int x = a;
        for (int i = 1; i < n; i++){
            x = x*a;
        }
        System.out.println(a + " do potęgi " + n + " = " + x);
    }
    public void alphabet (){

        for (int i = 'A'; i <= 'Z'; i = i + 2){
            System.out.print((char) i + " ");
        }
        System.out.println();

        int x = 'A';
        while (x <= 'Z'){
            System.out.print((char) x + " ");
            x = x+2;
        }
        System.out.println();
    }

    public void compareString(String a, String b){
        int i = 0;
        while (a.charAt(i) == b.charAt(i)) {
            i++;
            System.out.println("Taki sam");
        }

    }

    public static void main(String[] args) {
        Loops test = new Loops();
        test.showN(10);
        test.powerN(2,8);
        test.alphabet();
        test.compareString("abcde", "abcdf");

        for (int j = 0; j < 5; j++) {
            System.out.println("Krowa");

        }

    }
}
