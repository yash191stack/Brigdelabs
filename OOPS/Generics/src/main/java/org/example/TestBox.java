package org.example;

// Generic Box Class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class TestBox {
    public static void main(String[] args) {

        // Integer store
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer Box: " + intBox.get());

        // String store
        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String Box: " + strBox.get());

        // Double store
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(99.75);
        System.out.println("Double Box: " + doubleBox.get());
    }
}

