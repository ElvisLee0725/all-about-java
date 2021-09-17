import java.util.*;

public class Application {
    public static void main(String[] args) {
        Container<Integer, String> container = new Container<>(12, "Hello");
//        System.out.println(container.getItem1());
//        System.out.println(container.getItem2());
        Container<Double, Integer> container2 = new Container<>(12.50, 23);


        Set<String> set1 = new HashSet<>();
        set1.add("first");
        set1.add("second");
        set1.add("hello");

        Set<String> set2 = new HashSet<>();
        set2.add("first");
        set2.add("second");
        set2.add("world");

        Set<String> result = union(set1, set2);
        Iterator<String> itr = result.iterator();
        while(itr.hasNext()) {
            String val = itr.next();
            System.out.println(val);
        }

        // ? is the wild card
        List<?> employee = new ArrayList<>();
        List<String> accountants = new ArrayList<>();
        employee = accountants;

        // Upper bound: Employee
        ArrayList<? extends Employee> employees1 = new ArrayList<>();
        ArrayList<Accountant> accountant1 = new ArrayList<>();
        employees1 = accountant1;

        // Lower bound: Employee
        ArrayList<? super Employee> employees2 = new ArrayList<>();
        ArrayList<Object> accountant2 = new ArrayList<>();
        employees2 = accountant2;

        List<Employee> employees3 = new ArrayList<>();
        employees3.add(new Employee());
        makeEmployeeWork(employees3);

        List<Accountant> accountants3 = new ArrayList<>();
        accountants3.add(new Accountant());
        makeEmployeeWork(accountants3);
    }

    // Specify that we want this method to take generic type of data
    // We can put in any number of generic type, and it doesn't have to be 1 letter ex. Hello
    public static <E, Hello> Set<E> union(Set<E> set1, Set<E> set2) {
        HashSet<E> hashSet = new HashSet<>(set1);
        hashSet.addAll(set2);
        return hashSet;
    }

    public static void makeEmployeeWork(List<? extends Employee> employees) {
        for(Employee emp : employees) {
            emp.work();
        }
    }
}
