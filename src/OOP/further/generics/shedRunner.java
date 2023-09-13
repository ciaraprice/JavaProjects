package OOP.further.generics;

public class shedRunner {

    public static void main(String[] args) {
        Shed <Vehicle> shed = new Shed<>();
        Vehicle v = new Vehicle(10, "blue", 15000);

        shed.setVehicle(v);

        shed.getInfo();

        Train train = new Train(12, "green", 2300000);

        shed.setVehicle(train);

        shed.getInfo();
    }
}
