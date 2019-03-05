package pl.sda.blok1.loops;

public class palindrom {
    public static void main(String[] args) {
         String data = "Kobyła ma mały bok";
        //String data = "kottok";

        String temp1 = data.toLowerCase().trim();
        temp1 = temp1.replace(" ", "");
        char[]
                temp2 = new char[temp1.length()];

        for (int i = temp1.length() - 1; i >=0; i--){
            temp2[temp1.length()-1 -i] = temp1.charAt(i);

        }


        StringBuilder revers = new StringBuilder();
        revers.append(temp2);



        if (temp1.equals(revers.toString())) {
            System.out.println("String ' " + data + " ' jest Palindromem");
        } else
            System.out.println("String " + data + " nie jest Palindromem");
    }
}
