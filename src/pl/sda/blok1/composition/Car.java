package pl.sda.blok1.composition;

public class Car {
    private String brand;
    private Engine engine; // wkomponowana klasa `Engine`
    private Entertainment entertainment;


    public Car(String brand, Engine engine, Entertainment entertainment) { // konstruktor wymaga od nas podania obiektu typu Engine
        this.brand = brand;
        this.engine = engine;
        this.entertainment = entertainment;
    }


    public String getBrand() {
        return brand;
    }

    public void start() {
        engine.start(); // wywołanie metody na obiekcie `Engine`
    }

    public void volumeUp(){
        entertainment.volumeUp();
    }

    public void volumeDown() {
        entertainment.volumeDown();
    }

    public EngineType getType() {
        return engine.getEngineType(); // wywołanie metody na obiekcie `Engine`
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
