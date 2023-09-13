package OOP.further.generics;

public class Vehicle {
    private int age;
    private String color;
    private int mileage;

    @Override
    public String toString() {
        return "Vehicle{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public Vehicle(int age, String color, int mileage) {
        super();
        this.age = age;
        this.color = color;
        this.mileage = mileage;
    }

}
