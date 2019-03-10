package pl.sda.blok1.interface1;

public class Fish implements Animal, Swimmable{
    @Override
    public String getName() {
        return "Okoń";
    }

    @Override
    public String speak() {
        return "Bul bul";
    }

    @Override
    public String swim() {
        return "I'm swimming :D";

    }

    @Override
    public int getAge() {
        return 5;
    }
}
