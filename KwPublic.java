public class KwPublic {
    public String name;
    public KwPublic(String name) {
        this.name = name;
    }
    public void displayGreeting() {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        KwPublic example = new KwPublic("Alice");
        System.out.println("Name: " + example.name);
        example.displayGreeting();
    }
}
