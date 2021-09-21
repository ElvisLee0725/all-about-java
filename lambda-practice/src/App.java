public class App {
    public static void main(String[] args) {
        Human tom = new Human();
        walker(tom);

        Robot wale = new Robot();
        walker(wale);

        walker(() -> System.out.println("Custom object walks..."));

        // Assign lambda expression to functional interface
        Walkable aBunchOfCode = () -> {
            System.out.println("This is a bunch of code");
            System.out.println("I am running");
        };

        walker(aBunchOfCode);
    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}
