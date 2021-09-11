package customTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bear");
        
        printElements(animals);

        List<Vehicle> vehicles = new LinkedList<>();
        vehicles.add(new Vehicle("Honda", "Civic", 12000, false));
        vehicles.add(new Vehicle("Toyota", "Camry", 18000, false));

        printElements(vehicles);
//        for(Vehicle vehicle : vehicles) {
//            System.out.println(vehicle.toString());
//        }

    }

    public static void printElements(List list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
