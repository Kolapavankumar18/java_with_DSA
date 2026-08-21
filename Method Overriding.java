Method Overriding:
  class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}

Output:
Dog barks

  Interface:
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}

Output:
Car starts
