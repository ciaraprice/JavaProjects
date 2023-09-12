package OOP.further;

public class Car extends Vehicle {

    public Car() {

    }

    private int bootSize;

    public void setBoot(int bootSize) {
        this.bootSize = bootSize;
    }

    public String toString() {
          return "Car{ boot size: " + bootSize +
         '}';

    }

    @Override
    public double calBill() {
        return 10;
    }
}

