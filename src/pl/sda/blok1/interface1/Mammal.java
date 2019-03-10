package pl.sda.blok1.interface1;

public class Mammal implements Animal {
    @Override
    public String getName() {
        return "Koń";
    }

    @Override
    public String speak() {
        return "Patataj";
    }

    @Override
    public int getAge() {
        return 10;
    }


}
