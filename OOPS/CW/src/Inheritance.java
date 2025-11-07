public class Inheritance {
    static class Animal{

        void walk(){
            System.out.println("I am walking");
        }
    }

    static class Dog extends Animal{
        void bark(){
            System.out.println("I am Barking");
        }
    }

    public static void main(String[] args) {
        Animal obj1 = new Animal();
        Dog obj2 = new Dog();
        obj1.walk();
        obj2.walk();
        obj2.bark();
    }
}
