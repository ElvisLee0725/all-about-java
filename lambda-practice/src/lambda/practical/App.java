package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );
//        System.out.println("Printing cars in price range: ");
//        printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);
//
//        System.out.println("Printing cars are blue: ");
//        printCars(cars, (c) -> c.getColor().equals("Blue"));

        // Java provides a lot Functional Interface, we don't need to define all by ourselves
        Function<Car, String> printPriceColor = (c) -> "price: " + c.getPrice() + " color: " + c.getColor();
        System.out.println(printPriceColor.apply(cars.get(0)));
    }

    // Predicate is a Java default functional interface. It works the same as the CarCondition interface we wrote ourselves
    public static void printCars(List<Car> cars, Predicate<Car> condition) {
        for(Car c : cars) {
            if(condition.test(c)) {
                c.printCar();
            }
        }
    }
}
