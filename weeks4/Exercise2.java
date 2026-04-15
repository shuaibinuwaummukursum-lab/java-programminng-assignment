interface Switchable {
    void turnOn();
    void turnOff();
}

class TV implements Switchable {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

class AirConditioner implements Switchable {
    public void turnOn() {
        System.out.println("Air Conditioner is turned ON");
    }

    public void turnOff() {
        System.out.println("Air Conditioner is turned OFF");
    }
}

class Exercise2 {
    public static void main(String[] args) {
        TV tv = new TV();
        AirConditioner ac = new AirConditioner();

        tv.turnOn();
        tv.turnOff();

        ac.turnOn();
        ac.turnOff();
    }
}