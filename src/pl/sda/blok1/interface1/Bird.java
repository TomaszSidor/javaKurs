package pl.sda.blok1.interface1;

public class Bird implements Animal, Flyable{
    @Override
    public String getName() {
        return "Elemelek";
    }

    @Override
    public String speak() {
        return "ćwir ćwir";
    }

    @Override
    public String fly() {
        return "I'm flying!!!";
    }

    @Override
    public int getAge() {
        return 10;
    }
}
