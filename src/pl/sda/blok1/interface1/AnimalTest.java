package pl.sda.blok1.interface1;

public class AnimalTest {

    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal fish = new Fish();
        Animal insect = new Insect();
        Animal mammal = new Mammal();
        Animal reptile = new Reptile();

        Animal[] animals = {bird, fish, insect, mammal, reptile};

        for (Animal animal : animals){
            System.out.println(animal.getName() + " " + animal.speak() + " age: " + animal.getAge() + " " + animal.isAlive() );
        }
        Plant palm = new Palm();

        System.out.println("Palm is alive: " + palm.isAlive());
    }
}
