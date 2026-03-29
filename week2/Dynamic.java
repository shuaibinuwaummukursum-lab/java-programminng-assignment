class Vehicle {

    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {

    void move() {
        System.out.println("Car moves fast");
    }
}

public class Dynamic {

    public static void main(String[] args) {

        Vehicle v = new Car(); 
        v.move();

    }
}