package Arrays;
import OOP.Car;

public class arrayRunner {
    public static void main(String[] args) {

        // created an array
        String[] names = {"bmw", "vw", "c1"};
        System.out.println(names.length);

        // for loop for my array
        for (int i =0; i <names.length; i++) {
            System.out.println("I: " + i + " Name: " + names[i]);
        }

        // enhanced for loop
        for (String name: names) {
            System.out.println("Name: " +name);
        }
    }
}
