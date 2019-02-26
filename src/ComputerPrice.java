/**
 * W klasie ComputerPrice wydziel metody getComputerPrice(), getMonitorPrice() i getComputerAndMonitorPrice(),
 * ostatnia z metod ma korzystać z dwóch pierwszych. Zmienną VAT ustaw jako pole klasy ComputerPrice.
 */


public class ComputerPrice {
    double vatTax = 1.23;
    double plyta_glowna = 265;
    double procesor = 1000;
    double ram = 800;
    double dysk_twardy = 400;
    double monitor = 500;

    public ComputerPrice(double vatTax, double plyta_glowna, double procesor,
                         double ram, double dysk_twardy, double monitor) {
        this.vatTax = vatTax;
        this.plyta_glowna = plyta_glowna;
        this.procesor = procesor;
        this.ram = ram;
        this.dysk_twardy = dysk_twardy;
        this.monitor = monitor;
    }

    public double getMonitorPrice(){
        return this.monitor * this.vatTax;
    }
    public double getComputerPrice(){

        return (this.plyta_glowna + this.procesor + this.ram + this.dysk_twardy) * this.vatTax;
    }

    public double getComputerAndMonitorPrice(){

        return getMonitorPrice() + getComputerPrice();


    }

    public static void main(String[] args) {
        ComputerPrice newComputer = new ComputerPrice(1.23, 583,729,
                                                    399,600, 1000);
        System.out.println("Computer price = " +  newComputer.getComputerPrice());
        System.out.println("Monitor price = " + newComputer.getMonitorPrice());
        System.out.println("Computer and MOnitor price = " + newComputer.getComputerAndMonitorPrice());



    }


}

