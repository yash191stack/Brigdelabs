package Constructor;
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // constructor chaining → default radius 1.0
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class two {
}
