package oopsConcepts;


class Vehicle1 {

    void start() {
        System.out.println("Vehicle is Starting");
    }
}

class Car extends Vehicle1 {

    void drive() {
        System.out.println("Car is Driving");
    }
}

public class Vehicle {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.drive();
    }
}


