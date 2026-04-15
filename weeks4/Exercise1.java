interface Playable {
    void play();
}

class Piano implements Playable {
    public void play() {
        System.out.println("Piano is playing");
    }
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar is strumming");
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Piano p = new Piano();
        Guitar g = new Guitar();

        p.play();
        g.play();
    }
}