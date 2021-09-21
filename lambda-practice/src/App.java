//Lambda allows the separation between objects and functions

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

        ALambdaInterface printHello = () -> System.out.println("Hello there");
        printHello.someMethod();

        Calculate sumUpTwo = (num1, num2) -> num1 + num2;
        System.out.println(sumUpTwo.calc(4, 7));

        Calculate nonDivideByZero = (n1, n2) -> {
            if(n2 == 0) {
                return 0;
            }
            return n1 / n2;
        };

        System.out.println(nonDivideByZero.calc(34, 6));

        MyGenericInterface<String> reverseString = (str) -> {
            StringBuilder sb = new StringBuilder();
            for(int i = str.length()-1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            return sb.toString();
        };

        System.out.println(reverseString.work("Hello World"));

        MyGenericInterface<Integer> factorial = (num) -> {
            int result = 1;
            for(int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.work(6));
    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}
