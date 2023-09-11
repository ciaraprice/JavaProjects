package OOP;

public class Car {
    private String manufacturer;
    private String model;
    private String color;
    private int age;
    private int mileage;

    double calMileage () {
        return ((100 - age)/100.0) * mileage;
    }

    public String toString(){
        return("Hello my car is a  " + color + " " + manufacturer + " " + model + " . It is " + age  + " years old. That has " + calMileage() + " miles.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getMileage(){
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    private static String carType = "Petrol";

    public Car(){

    }

    public Car(String color, String model, int age, String manufacturer, int mileage) {
        this.color = color;
        this.model = model;
        this.age = age;
        this.manufacturer =manufacturer;
        this.mileage = mileage;
    }

    public static void setCarType(String carType) {
        Car.carType = carType;
    }

    public static String getCarType() {
        return carType;
    }
}
