package pl.sda.blok1.abstra;

public abstract class Vegetable extends Food {
    public Vegetable(String name) {
        super(name);
    }

    @Override
    public FoodType getType() {
        return FoodType.VEGETABLE;
    }
}
