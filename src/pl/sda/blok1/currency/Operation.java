package pl.sda.blok1.currency;

public enum Operation {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');


    private char symbol;

    Operation(char symbol) {
        this.symbol = symbol;
    }

    public double calculate(double a, double b){
        double c = 0.0;

        switch (this){  //this odnosi się do konkretnej wartości Enuma, deklarowane w miejscu użycia (w mainie)
            case PLUS : c = a + b; break;
            case MINUS : c = a - b; break;
            case MULTIPLY : c = a * b; break;
            case DIVIDE : c = a / b; break;

        }
        return c;
    }
}
