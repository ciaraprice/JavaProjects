package OOP.further;

public class Plane extends Vehicle {
    public Plane(int age, String color, int mileage) {
        super(age, color, mileage);
    }
    private boolean hasPropell;

    public void setHasPropellor(boolean hasPropellor) {
        this.hasPropell = hasPropellor;
    }


    public String toString() {
        return "Plane{ has a propellor: " + hasPropell +
                '}';

    }

    }
