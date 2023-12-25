abstract class Animal {
    abstract void makeSound();
    void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

interface Vehicle {
    void run();
}

class Car implements Vehicle {
    public void run() {
        System.out.println("Vroom...");
    }
}

public class prob3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Car car = new Car();
        car.run();
    }
}