public class FahrenheitConverter {

    public double convertToCelcius(double tempInFahrenheit) {


        return ((tempInFahrenheit - 32) / 1.8);
    }

    public double convertToFahrenheit(double tempInCel) {


        return ((tempInCel * 1.8) + 32);
    }

    public static void main(String[] args) {

        FahrenheitConverter nowy = new FahrenheitConverter();

        System.out.println(nowy.convertToCelcius(212));
        System.out.println(nowy.convertToFahrenheit(100));

    }


}

