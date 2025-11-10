package com.bridgelabz.oops.levelone;

/*
    Demonstrates:
    3. Liskov Substitution Principle
    4. Avoid Deep Inheritance Hierarchies
    5. Mark Superclass Methods final If Needed
    6. Use @Override Annotation
    7. Minimize Public Fields in Superclasses
    8. Avoid Overloading Alongside Overriding
*/

class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public final void showBasicInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    private String fuelType;

    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " car is starting with " + fuelType + " fuel.");
    }
}

class ElectricCar extends Vehicle {
    private int batteryCapacity;

    public ElectricCar(String brand, int speed, int batteryCapacity) {
        super(brand, speed);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " electric car is starting silently with battery capacity " + batteryCapacity + " kWh.");
    }
}

public class InheritancePrinciplesDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("Toyota", 120, "Petrol");
        Vehicle vehicle2 = new ElectricCar("Tesla", 200, 85);

        vehicle1.showBasicInfo();
        vehicle1.start();

        System.out.println();

        vehicle2.showBasicInfo();
        vehicle2.start();
    }
}
