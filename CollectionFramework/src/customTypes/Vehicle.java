package customTypes;

public class Vehicle {
    String make;
    String model;
    int price;
    boolean fwd;

    public Vehicle(String make, String model, int price, boolean fwd) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fwd = fwd;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fwd=" + fwd +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFwd() {
        return fwd;
    }

    public void setFwd(boolean fwd) {
        this.fwd = fwd;
    }
}
