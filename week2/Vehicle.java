class Vehicle {

    void move() {
        System.out.println("Vehicle is moving");
    }

    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        c.move();
        b.move();
    }
}

class Car extends Vehicle {

    void move() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {

    void move() {
        System.out.println("Bike is riding");
    }
}