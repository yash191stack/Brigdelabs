package Functional_Interference;

public class TemperatureAlert {

}

import java.util.function.Predicate;

class Demo {
    public static void main(String[] args) {
        Predicate<Double> alert = temp -> temp > 40.0;
        double currentTemp = 42.5;
        System.out.println(alert.test(currentTemp) ? "Alert!" : "Normal.");
    }
}
