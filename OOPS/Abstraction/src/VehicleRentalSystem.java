interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    private String policyNumber = "CAR-INS-123";
    public Car(String vehicleNumber, double rentalRate) { super(vehicleNumber, "Car", rentalRate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return getRentalRate() * 0.10; }
    public String getInsuranceDetails() { return "Policy: " + policyNumber; }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber = "BIKE-INS-321";
    public Bike(String vehicleNumber, double rentalRate) { super(vehicleNumber, "Bike", rentalRate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return getRentalRate() * 0.05; }
    public String getInsuranceDetails() { return "Policy: " + policyNumber; }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber = "TRUCK-INS-999";
    public Truck(String vehicleNumber, double rentalRate) { super(vehicleNumber, "Truck", rentalRate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    public double calculateInsurance() { return getRentalRate() * 0.15; }
    public String getInsuranceDetails() { return "Policy: " + policyNumber; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("UP80CAR12", 2000),
                new Bike("UP80BIKE45", 500),
                new Truck("UP80TRUCK99", 4000)
        };

        for (Vehicle v : vehicles) {
            double rental = v.calculateRentalCost(5);
            double insurance = ((Insurable)v).calculateInsurance();
            System.out.println(v.getType() + " " + v.getVehicleNumber());
            System.out.println("Rental: " + rental + " | Insurance: " + insurance);
            System.out.println(((Insurable)v).getInsuranceDetails());
            System.out.println("-----------------");
        }
    }
}
