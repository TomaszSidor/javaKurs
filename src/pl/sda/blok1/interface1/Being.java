package pl.sda.blok1.interface1;

public interface Being {
    int getAge();
    final int MAX_AGE = 100;

    default boolean isAlive(){ //default - domyślna metoda, może być nadpisywana prezez każdą niższą klasę

        return (getAge() < MAX_AGE);
    }


}
