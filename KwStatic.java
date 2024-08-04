public class KwStatic {
    static int count = 0;
    public static void incrementCount() {
        count++;
    }
    static {
        System.out.println("Static block executed.");
        count = 10;
    }
    public void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        KwStatic.incrementCount();

        KwStatic example = new KwStatic();
        example.displayCount(); 

        KwStatic anotherExample = new KwStatic();
        anotherExample.displayCount();

        KwStatic.incrementCount();
        example.displayCount(); 
    }
}
