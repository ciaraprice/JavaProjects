package OOP.further.generics;

public class Bike extends Vehicle{

    public Bike(int age, String color, int mileage) {
        super(age, color, mileage);
    }

    private boolean hasSideCar;

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }


    public String toString() {
        return "MotorBike{ has a side car:  " + hasSideCar +
                '}';

    }
}
