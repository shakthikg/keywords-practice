public class KwPrivate {
    private final String name;

    public KwPrivate(String name) {
        this.name = name;
    }

    private void greet() {
        System.out.println("Hello, " + name + "!");
    }

    public void displayGreeting() {
        greet();
    }

    public static void main(String[] args) {
        KwPrivate example = new KwPrivate("Alice");

        example.displayGreeting();
    }
}
