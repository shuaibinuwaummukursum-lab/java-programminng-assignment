public class Printer {

    void print(String text) {
        System.out.println("String: " + text);
    }

    void print(int number) {
        System.out.println("Integer: " + number);
    }

    void print(double value) {
        System.out.println("Double: " + value);
    }

    public static void main(String[] args) {

        Printer p = new Printer();

        p.print("Hello bbey Ummuh");
        p.print(10);
        p.print(5.5);
    }
}