public class Chicken extends Bird implements Flyable{
    public Chicken(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void fly() {
        System.out.println("Chicken can't fly...");
    }


}
