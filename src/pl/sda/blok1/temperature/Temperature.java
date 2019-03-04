package pl.sda.blok1.temperature;

/**
 * * Utwórz nową klasę Temperature, która będzie posiadała pola: double temperature, testy date, testy hour.
 * Klasa określa temperaturę w skali Celsjusza w konkretnym dniu i o konkretnej godzinie.
 * Dodaj konstruktor inicjalizujący wszystkie trzy pola, metody-gettery dla każdego pola + dodaj metodę show()
 * która będzie zwracała napis w postaci: {date} {hour} - {temperature} °C, np: 2018-10-01 10:45 - 13 °C
 *
 * * Dodaj do klasy Temperature metodę showInFahrenheit() która zwróci taki sam napis jak wyżej tylko w skali Fahrenheit.
 * Do konwersji temperatur użyj klasy FahrenheitConverter.
 */

public class Temperature {

    //properties
    double temperature;
    String data;
    String hour;

    //constructor
    public Temperature(){};
    public Temperature(double temperature, String data, String hour) {
        this.temperature = temperature;
        this.data = data;
        this.hour = hour;
    }

    //getters
    public double getTemperature() {
        return temperature;
    }

    public String getData() {
        return data;
    }

    public String getHour() {
        return hour;
    }

    //setters
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String show(){
        return getData() + " " + getHour() + " " + getTemperature() + "°C";
    }

    public String showInFahrenheit(){
        FahrenheitConverter nowy = new FahrenheitConverter();

        return getData() + " " + getHour() + " " + nowy.convertToFahrenheit(getTemperature()) + "°F";
    }

    public static void main(String[] args) {

        Temperature test = new Temperature();

        test.setData("2019-02-13");
        test.setHour("21:35");
        test.setTemperature(0);

        System.out.println(test.show());
        System.out.println(test.showInFahrenheit());
    }
}
