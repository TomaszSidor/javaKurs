package pl.sda.blok1.familly;

public class FamillyTest {
    public static void main(String[] args) {
        Person dad1 = new Person("Darek", "Kowalski", 32);
        Person mum1 = new Person("Kasia", "Ziemniak ", 25);
        Person son1 = new Person ("Pawełek", "Kowalski", 5);

        Familly kowalscy = new Familly(dad1, mum1, son1, "Kowalscy");
        System.out.println(kowalscy.toString());

    }
}
