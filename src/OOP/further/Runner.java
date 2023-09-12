package OOP.further;

public class Runner {
    public static void main(String[] args) {
    Car c = new Car();
    c.setAge(10);
    c.setMileage(1300);
    c.setColor("Pink");
    c.setBoot(20);

        Plane p = new Plane(10, "white", 25000);
        p.setHasPropellor(true);

        Motorbike m = new Motorbike(7, "black", 2000);
        m.setHasSideCar(true);

        Car c1 = new Car();

        Car c2 = new Car();


        Garage g = new Garage();
        g.addVehicle(c);
        g.addVehicle(p);
        g.addVehicle(m);
        g.addVehicle(c1);

        System.out.println(g);
        System.out.println(g.giveBill());
        g.removeByType("Plane");
        System.out.println(g);
        g.removeByType("Car");
        System.out.println(g);

        System.out.println("below is the calc bill");
        g.addVehicle(c2);
        System.out.println(g.calBill());



        g.removeAll();
        System.out.println(g.giveBill());



    }

}
