abstract class Device {
    abstract void turnOn();
}

class Fan extends Device {
    void turnOn() {
        System.out.println("Fan is now ON");
    }
}

class Light extends Device {
    void turnOn() {
        System.out.println("Light is now ON");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Device d1 = new Fan();
        Device d2 = new Light();

        d1.turnOn();
        d2.turnOn();
    }
}