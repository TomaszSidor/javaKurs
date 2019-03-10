package pl.sda.blok1.abstra;

public abstract class Food {
    public abstract String getTaste();
    public abstract FoodType getType();
    private String name;

    public String getName() {
        return name;
    }

    public Food(String name) {
        this.name = name;
    }
}
