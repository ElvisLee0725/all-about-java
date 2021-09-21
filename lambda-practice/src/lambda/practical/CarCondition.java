package lambda.practical;

@FunctionalInterface
public interface CarCondition<T> {
    // Use generic so the input doesn't have to be Car, it can be any type of Object
    public boolean test(T type);
}
