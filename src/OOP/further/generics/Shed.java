package OOP.further.generics;

public class Shed <T extends Vehicle>{

    private T vehicle;  // array list for multiple

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public void getInfo() {
        System.out.println(vehicle + " is in shed");
    }
}

