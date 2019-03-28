package pl.sda.blok1.interface1;

public interface Plant extends Being {
    String getName();

    @Override
    default boolean isAlive() {
        return getAge() < 1000;
    }
}
