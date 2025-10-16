package Functional_Interference;

public class SmartVehicle {

}

interface VehicleDashboard {
    void displaySpeed();
    default void displayBatteryLevel() {}
}

class ElectricVehicle implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 88 km/h"); }
    public void displayBatteryLevel() { System.out.println("Battery: 85%"); }
}

class Demo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle();
        ev.displaySpeed();
        ev.displayBatteryLevel();
    }
}
