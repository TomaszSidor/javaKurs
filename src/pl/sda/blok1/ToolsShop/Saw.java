package pl.sda.blok1.ToolsShop;

public class Saw extends Tool{

    private int lenght;

    public Saw(String model, double price, int lenght) {
        super(model, price);
        this.lenght = lenght;
    }


    public String showDescription() {
        return super.showDescription() + " Saw lenght = " + lenght;
    }
}
