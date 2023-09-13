package OOP.interfaces;

import java.util.ArrayList;
import java.util.List;

public class flyRunner {
    public static void main(String[] args) {
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Bird());
        flyables.add(new Plane());

        for (Flyable f : flyables) {
            f.fly();
        }
    }
}
