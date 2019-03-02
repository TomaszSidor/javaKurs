/**
 * W klasie ComputerPrice wydziel metody getComputerPrice(), getMonitorPrice() i getComputerAndMonitorPrice(),
 * ostatnia z metod ma korzystać z dwóch pierwszych. Zmienną VAT ustaw jako pole klasy ComputerPrice.
 */
public class ComputerPrice {
    double vatTax = 1.23;
    double mainBoard = 265;
    double procesor= 1000;
    double ram = 800;
    double HDD= 400;
    double monitor = 500;

    public ComputerPrice(){};

    public ComputerPrice(double vatTax, double mainBoard, double procesor,
                         double ram, double HDD, double monitor) {
        this.vatTax = vatTax;
        this.mainBoard = mainBoard;
        this.procesor = procesor;
        this.ram = ram;
        this.HDD = HDD;
        this.monitor = monitor;
    }
    public double getMonitorPrice(){
        return this.monitor * this.vatTax;
    }

    public double getComputerPrice(){
        return (this.mainBoard + this.procesor + this.ram + this.HDD) * this.vatTax;
    }

    public double getComputerAndMonitorPrice(){
        return getMonitorPrice() + getComputerPrice();
    }

    public static void main(String[] args) {
        ComputerPrice newComputer = new ComputerPrice(1.23, 522,729,
                                                    399,600, 1000);

        ComputerPrice newComputer2 = new ComputerPrice();

        System.out.println("Computer2  = " + newComputer2.getComputerAndMonitorPrice());
        System.out.println("Computer price = " +  newComputer.getComputerPrice());
        System.out.println("Monitor price = " + newComputer.getMonitorPrice());
        System.out.println("Computer and Monitor price = " + newComputer.getComputerAndMonitorPrice());
        System.out.println("Computer and Monitor price GIT= " + newComputer.getComputerAndMonitorPrice());
    }
}

