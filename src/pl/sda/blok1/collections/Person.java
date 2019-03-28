package pl.sda.blok1.collections;

public class Person implements Comparable{
    private String firstName;
    private String lastName;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
