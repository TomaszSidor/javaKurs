package pl.sda.blok1.string;

public class testy {
    private String text;

    public testy(String text) {
        this.text = text;
    }

    public  String simonSays (){
        return "Simon says " + this.text;
    }
    public  String simonSays2 (){
        StringBuilder nowy = new StringBuilder();
        nowy.append("Simon says ").append(text);
        return nowy.toString();
    }

    public String cleanAndChange (){
        String nowy = text.trim().toLowerCase();
        return nowy;
    }

    public boolean isFirstCharEven(String a, String b){
       return a.charAt(0) == b.charAt(0);
    }

    public boolean is3EndEven (String a, String b){
        String s1 = (a.substring(a.length() - 3));
        String s2 = (b.substring(b.length() - 3));

        return (s1.equals(s2));
    }

    public boolean isNieThreeTimes (String a) {
        int x = a.indexOf("nie"); // index pierwszego "nie"
        boolean result = false;

        if (x >= 0){
            String b = a.substring(x + 3); // nowy string od indexu za pierwszym "nie"
            int y = b.indexOf("nie");
            if (y >= 0){
                String c = b.substring(y + 3); // nowy string od indexu drugiego "nie"
                result = c.contains("nie"); // jesli tu jest "nie", to warunek spelniony i koniec
            }
        }
        return result;
    }

    public static void main(String[] args) {
        testy nowe = new testy("Cześć Wam!!!");
        System.out.println(nowe.simonSays());

        System.out.println(nowe.simonSays2());
        System.out.println(nowe.cleanAndChange());
        System.out.println("Pierwszy znak jest taki sam: " + nowe.isFirstCharEven("AXZ", "Abc"));
        System.out.println("Ostatnie trzy znaki sa takie same: " + nowe.is3EndEven("3abc", "2abc"));
        System.out.println("Czy występuje 3 razy Nie?? : " + nowe.isNieThreeTimes("latanienie lalanie niewazne"));


    }


}
