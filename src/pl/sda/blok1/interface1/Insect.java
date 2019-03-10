package pl.sda.blok1.interface1;

public class Insect implements Animal, Flyable {

    @Override
    public String getName() {
        return "Mucha";
    }

    @Override
    public String speak() {
        return "Bzzzzzzz";
    }

    @Override
    public String fly() {
        return "I'm flying!!!";

    }

    @Override
    public int getAge() {
        return 3;
    }
}
