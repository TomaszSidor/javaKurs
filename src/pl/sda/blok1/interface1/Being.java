package pl.sda.blok1.interface1;

public interface Being {
    int getAge();
    final int MAX_AGE = 100;

    default boolean isAlive(){
        return (getAge() < MAX_AGE);
    }


}
