package pl.sda.blok1.abstra;

public abstract class Meat extends Food{
    public Meat(String name) {
        super(name);
    }

    @Override
    public FoodType getType(){
        return FoodType.MEAT;
    }

}
