package OOP.further;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles = new ArrayList<>();

    public boolean addVehicle(Vehicle v) {
        return this.vehicles.add(v);
    }

    public void removeVehicle(int id) {
        for (Vehicle v : this.vehicles) {
            if (v.getId() == id) {
                this.vehicles.remove(v);
                return;
            }
        }
    }

    public void removeAll() {
        this.vehicles.clear();
    }

    public int giveBill() {
        int bill = 0;
        for (Vehicle v : this.vehicles) {
            if (v instanceof Car) {
                bill += 10;
            } else if (v instanceof Plane) {
                bill += 200;
            } else if (v instanceof Motorbike) {
                bill += 50;
            }
        }
        return bill;
    }

    public boolean removeByType(String type) {
        for (int i = this.vehicles.size() - 1; i >= 0; i--) {
            Vehicle v = this.vehicles.get(i);
            if (v.getClass().getSimpleName().equals(type)) {
                this.vehicles.remove(v);
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Garage{" +
                "vehicles=" + vehicles +
                '}';
    }

}

