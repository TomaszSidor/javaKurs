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

    public int howManyPhrase (String phrase, String text){
        int result = 0;

        for (int i = 0; i < text.length(); i++){
            if (text.indexOf(phrase) >= 0){
                text = text.substring(text.indexOf(phrase) + phrase.length());
                result++;
            }


//            if (x >= 0){
//                String b = a.substring(x + 3); // nowy string od indexu za pierwszym "nie"
//                int y = b.indexOf("nie");
//                if (y >= 0){
//                    String c = b.substring(y + 3); // nowy string od indexu drugiego "nie"
//                    result = c.contains("nie"); // jesli tu jest "nie", to warunek spelniony i koniec

        }

        return result;
    }

    public static void main(String[] args) {
        Loops test = new Loops();
        test.showN(10);
        test.powerN(2,8);
        test.alphabet();
        System.out.println("Czy a i b są takie same: " + test.compareString("abcde fghj", "abcde fghi"));

        String phrase = "nie";
        String text = "nie bardzo wiem jak to mam nie powiedzieć, niezasłużyłem na taką niesprawiedliwość co nie? ";
        System.out.println("NIE w tekscie występuje " + test.howManyPhrase(phrase, text) + " razy.");
    }
}
