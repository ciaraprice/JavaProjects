package OOP.further;

public abstract class Vehicle {

    private int age;
    private String color;
    private int mileage;



    public Vehicle(int age, String color, int mileage) {
        super();
        this.age = age;
        this.color = color;
        this.mileage = mileage;
    }

    public abstract double calBill();

    private int id;

    public int getId() {
        return id;
    }


    private static int count;


    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public Vehicle(){
        this.id = count++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor (String color){
        this.color = color;
    }

    public int getMileage(){
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
