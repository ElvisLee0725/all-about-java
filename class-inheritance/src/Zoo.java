public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(12, "M", 45);
        animal1.eat();

        Bird bird1 = new Bird(2, "F", 10);
        bird1.fly();
        bird1.sleep();
    }
}
