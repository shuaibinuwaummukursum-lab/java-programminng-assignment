abstract class Subject {
    abstract void study();
}

class Math extends Subject {
    void study() {
        System.out.println("Studying Mathematics...");
    }
}

class English extends Subject {
    void study() {
        System.out.println("Studying English...");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Subject s1 = new Math();
        Subject s2 = new English();

        s1.study();
        s2.study();
    }
}