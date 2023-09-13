package OOP.interfaces;

public class Plane extends Vehicle implements Flyable{


    @Override
    public void fly() {
        System.out.println("Nyoooooommmm");
    }
}
