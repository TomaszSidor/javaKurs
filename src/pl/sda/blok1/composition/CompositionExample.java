package pl.sda.blok1.composition;

public class CompositionExample {
    public static void main(String[] args) {
        // deklaracja i inicjalizacja klasy Engine
        Engine engine = new Engine(2000, EngineType.PETROL);
        Entertainment entertainment = new Entertainment();

        // deklaracja i incjalizacja klasy Car z podanym obiektem klasy Engine jako 2 argument
        Car car1 = new Car("Toyota", engine, entertainment);

        System.out.println(car1); // wyświetlamy informacje o samochodzie (toString())

        car1.volumeUp();
        car1.start();

        // wyświetlamy typ sil
        // ika zastosowanego w samochodzie,
        // wewnętrznie wykonuje się metoda na obiekcie klasy Engine
        System.out.println("Car is: " + car1.getType());

        Car car2 = new Car("Toyota", new Engine(3000, EngineType.DIESEL), entertainment);
        System.out.println(car2);
        System.out.println("Car is: " + car2.getType());
    }
}
