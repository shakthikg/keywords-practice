public class KwNull {
    public static void main(String[] args) {
        String myString = null;

        if (myString == null) {
            System.out.println("The variable myString is null.");
        } else {
            System.out.println("The variable myString is not null.");
        }

        myString = "Hello, World!";

        if (myString == null) {
            System.out.println("The variable myString is null.");
        } else {
            System.out.println("The variable myString is not null.");
        }

        System.out.println("Value of myString: " + myString);
    }
}
