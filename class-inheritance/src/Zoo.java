public class Zoo {
    public static void main(String[] args) {
        Animal s1 = new Sparrow(3, "M", 23);
        moveAnimal(s1);

        Animal f1 = new Fish(4, "F", 90);
        moveAnimal(f1);
    }

    // Polymorphism: Making the program more dynamic
    // Animal is the parent class of Sparrow and Fish. Now they can both be calling move()
    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
