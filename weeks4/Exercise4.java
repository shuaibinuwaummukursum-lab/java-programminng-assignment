interface FareCalculator {
    double calculateFare(double distance);
}

class Bus implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 50;
    }
}

class Taxi implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 100 + 200;
    }
}

class Exercise4 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        double distance = 10;

        System.out.println("Bus Fare: " + bus.calculateFare(distance));
        System.out.println("Taxi Fare: " + taxi.calculateFare(distance));
    }
}