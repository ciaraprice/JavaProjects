package OOP;

public class carRunner {
    public static void main(String[] args) {

        Car vw = new Car();
        System.out.println(vw.toString());

        vw.setManufacturer("Volkswagen");
        vw.setModel("golf");
        vw.setAge(5);
        vw.setColor("red");
        vw.setMileage(15000);
        System.out.println(vw.toString());

        Car bmw = new Car("blue", "series", 10, "bmw", 1300);
        System.out.println(bmw.toString());

        System.out.println(bmw.getCarType());
        Car.setCarType("Electric");
        System.out.println(vw.getCarType());

        System.out.println(vw);
    }
}