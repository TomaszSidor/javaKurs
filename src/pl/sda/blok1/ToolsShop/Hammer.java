package pl.sda.blok1.ToolsShop;

public class Hammer extends Tool{

    private int weight;


    public Hammer(String model, double price, int weight) {
        super(model, price);
        this.weight = weight;
    }


    public String showDescription() {
        return super.showDescription() + " Hammer weight = " + weight;

    }
}
