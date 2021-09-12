package hashset.linkedHashset;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Dog", 12);
        Animal animal2 = new Animal("Cat", 3);
        Animal animal3 = new Animal("Pig", 4);
        Animal animal4 = new Animal("Dog", 12);

        HashSet<Animal> hs = new HashSet<>();
        hs.add(animal1);
        hs.add(animal2);
        hs.add(animal3);
        hs.add(animal4);

        System.out.println(animal1.hashCode());
        System.out.println(animal4.hashCode());

        for(Animal animal : hs) {
            System.out.println(animal.toString());
        }

    }
}
