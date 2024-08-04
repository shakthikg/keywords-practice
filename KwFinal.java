// Final class
final class FinalClass {
    // Final variable
    public final int constantValue = 100;

    // Final method
    public final void showValue() {
        System.out.println("The constant value is: " + constantValue);
    }
}

// Trying to extend a final class would cause a compile-time error
// class SubClass extends FinalClass {} // Error: cannot subclass final class

public class KwFinal {
    public static void main(String[] args) {
        // Create an instance of the final class
        FinalClass obj = new FinalClass();

        // Access the final variable
        System.out.println("Constant value: " + obj.constantValue);

        // Call the final method
        obj.showValue();
    }
}
