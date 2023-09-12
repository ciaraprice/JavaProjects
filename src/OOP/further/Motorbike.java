package OOP.further;

public class Motorbike extends Vehicle {

    public Motorbike(int age, String color, int mileage) {
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

    @Override
    public double calBill() {
        return 5000;
    }
}
