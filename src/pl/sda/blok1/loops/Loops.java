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

    public boolean compareString(String a, String b){
        boolean result = false;

        if (a.length() == b.length()){ //pierwszy najprostrzy warunek czy a i b ma taka sama dlugosc
            for (int i = 0; i < a.length(); i++){
                result = (a.charAt(i) == b.charAt(i)); // do póki znaki są takie same, pętla sie wykonuje, jak jest
                                                         // false to break i result = false
                if (result == false) break;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Loops test = new Loops();
        test.showN(10);
        test.powerN(2,8);
        test.alphabet();
        System.out.println("Czy a i b są takie same: " + test.compareString("abcde fghj", "abcde fghi"));
    }
}
