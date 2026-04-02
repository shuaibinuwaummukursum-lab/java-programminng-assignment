abstract class Food {
    abstract void taste();
}

class Rice extends Food {
    void taste() {
        System.out.println("Rice tastes good!");
    }
}

class Pizza extends Food {
    void taste() {
        System.out.println("Pizza tastes delicious!");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Food f1 = new Rice();
        Food f2 = new Pizza();

        f1.taste();
        f2.taste();
    }
}