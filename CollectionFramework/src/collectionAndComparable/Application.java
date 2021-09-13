package collectionAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        HashSet<Employee> hs = new HashSet<>();
        hs.add(new Employee("Mike", 3500, "Accounting"));
        hs.add(new Employee("Paul", 3000, "Admin"));
        hs.add(new Employee("Jack", 5000, "IT"));
        hs.add(new Employee("Alex", 2500, "Sales"));

        List<Employee> list1 = new ArrayList<>(hs);
        Collections.sort(list1);
        System.out.println(list1);
    }



}
