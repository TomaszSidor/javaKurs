package pl.sda.blok1.interface1;

public class Reptile implements Animal, Swimmable {
    @Override
    public String getName() {
        return "Dinozaur";
    }

    @Override
    public String speak() {
        return "ARGHHGRRR!!!";
    }

    @Override
    public String swim() {
        return "I'm swimming :D";

    }

    @Override
    public int getAge() {
        return 150;
    }

    @Override
    public boolean isAlive(){
        return (getAge() < 300);
    }

}
