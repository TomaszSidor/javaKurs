package pl.sda.blok1.abstra;

public class Salad extends Vegetable {
    public Salad(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "Sałatkowy ";
    }
}
